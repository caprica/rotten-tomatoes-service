/*
 * This file is part of rotten-tomatoes-service.
 *
 * rotten-tomatoes-service is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * rotten-tomatoes-service is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with rotten-tomatoes-service.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2014 Caprica Software Limited.
 */

package uk.co.caprica.rottentomatoes.service.jaxrs;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import uk.co.caprica.rottentomatoes.domain.Movie;
import uk.co.caprica.rottentomatoes.domain.MovieSearchResults;
import uk.co.caprica.rottentomatoes.service.RottenTomatoesService;

import com.google.common.util.concurrent.RateLimiter;

/**
 *
 */
public class JaxrsRottenTomatoesService implements RottenTomatoesService {

    /**
     *
     */
    private static final String MOVIE_SEARCH_URL = "http://api.rottentomatoes.com/api/public/v1.0/movies.json";

    /**
     *
     */
    private static final String MOVIE_URL = "http://api.rottentomatoes.com/api/public/v1.0/movies";

    /**
     *
     */
    private final String apiKey;

    /**
     *
     */
    private final Client client;

    /**
     *
     */
    private final RateLimiter rateLimiter;

    /**
     *
     *
     * @param apiKey
     * @param requestsPerSecondLimit
     */
    public JaxrsRottenTomatoesService(String apiKey, int requestsPerSecondLimit) {
        this.apiKey = apiKey;
        client = ClientBuilder.newClient();
        rateLimiter = RateLimiter.create(requestsPerSecondLimit);
    }

    @Override
    public MovieSearchResults search(String query) {
        rateLimiter.acquire();
        return client
            .register(JsonContentTypeResponseFilter.class)
            .target(MOVIE_SEARCH_URL)
            .queryParam("apikey", apiKey)
            .queryParam("q", query)
            .request(MediaType.APPLICATION_JSON)
            .get(MovieSearchResults.class);
    }

    @Override
    public Movie movie(Integer id) {
        rateLimiter.acquire();
        return client
            .register(JsonContentTypeResponseFilter.class)
            .target(MOVIE_URL)
            .path(String.format("%s.json", String.valueOf(id)))
            .queryParam("apikey", apiKey)
            .request(MediaType.APPLICATION_JSON)
            .get(Movie.class);
    }
}
