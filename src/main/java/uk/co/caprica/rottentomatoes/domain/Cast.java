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

package uk.co.caprica.rottentomatoes.domain;

import java.util.List;

import com.google.common.base.Objects;

/**
 *
 */
public final class Cast {

    private String name;

    private Integer id;

    private List<String> characters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            name,
            id,
            characters
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cast)) {
            return false;
        }
        Cast other = (Cast)obj;
        return
            Objects.equal(name      , other.name      ) &&
            Objects.equal(id        , other.id        ) &&
            Objects.equal(characters, other.characters);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("name"      , name      )
            .add("id"        , id        )
            .add("characters", characters)
            .toString();
    }
}
