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

import com.google.common.base.Objects;

/**
 *
 */
public final class Director {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            name
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Director)) {
            return false;
        }
        Director other = (Director)obj;
        return
            Objects.equal(name, other.name);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("name", name)
            .toString();
    }
}
