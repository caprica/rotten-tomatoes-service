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

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import uk.co.caprica.rottentomatoes.domain.adapter.DateAdapter;

import com.google.common.base.Objects;

/**
 *
 */
public final class ReleaseDates {

    @XmlAttribute(name="theater")
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date theatre;

    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date dvd;

    public Date getTheatre() {
        return theatre;
    }

    public void setTheatre(Date theatre) {
        this.theatre = theatre;
    }

    public Date getDvd() {
        return dvd;
    }

    public void setDvd(Date dvd) {
        this.dvd = dvd;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            theatre,
            dvd
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseDates)) {
            return false;
        }
        ReleaseDates other = (ReleaseDates)obj;
        return
            Objects.equal(theatre, other.theatre) &&
            Objects.equal(dvd    , other.dvd    );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("theatre", theatre)
            .add("dvd"    , dvd    )
            .toString();
    }
}
