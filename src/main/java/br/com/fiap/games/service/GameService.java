package br.com.fiap.games.service;

import br.com.fiap.games.GamesApplication;
import br.com.fiap.games.model.Game;
import br.com.fiap.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public Game salvar(Game game){
        return gameRepository.save(game);
    }

    public List<Game> listarTodosOsGames(){
        return gameRepository.findAll();
    }

    public Game buscarGamePeloId(Long id){
        var gameOptional = gameRepository.findById(id);
        if (gameOptional.isPresent()){
            return gameOptional.get();
        } else {
            throw new RuntimeException("Game não encontrado!");
        }



    }

    public void excluir(Long id){
        gameRepository.deleteById(id);
    }

}
