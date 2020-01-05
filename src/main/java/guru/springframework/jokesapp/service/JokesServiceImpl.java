package guru.springframework.jokesapp.service;

import guru.springframework.jokesapp.model.ChuckNorrisJoke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private ChuckNorrisQuotes norrisQuotes;

    public JokesServiceImpl() {
        this.norrisQuotes = new ChuckNorrisQuotes();
    }

    public ChuckNorrisJoke getChuckNorrisJoke() {
        ChuckNorrisJoke chuckNorrisJoke = new ChuckNorrisJoke();
        chuckNorrisJoke.setText(norrisQuotes.getRandomQuote());
        return chuckNorrisJoke;
    }
}
