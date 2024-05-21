package br.com.fiap.games.controller;

import br.com.fiap.games.model.Game;
import br.com.fiap.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Game salvar(@RequestBody Game game){
        return gameService.salvar(game);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Game buscarPeloId(@PathVariable Long id){
        return gameService.buscarGamePeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Game> listarTodos(){
        return gameService.listarTodosOsGames();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        gameService.excluir(id);
    }

}
