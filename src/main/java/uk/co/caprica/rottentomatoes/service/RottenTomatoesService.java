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

package uk.co.caprica.rottentomatoes.service;

import uk.co.caprica.rottentomatoes.domain.Movie;
import uk.co.caprica.rottentomatoes.domain.MovieSearchResults;

/**
 *
 */
public interface RottenTomatoesService {

    /**
     *
     *
     * @param query
     * @return
     */
    MovieSearchResults search(String query);

    /**
     *
     *
     * @param id
     * @return
     */
    Movie movie(Integer id);
}
