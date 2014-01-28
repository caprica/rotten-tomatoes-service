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

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;

import com.google.common.base.Objects;

/**
 *
 */
public final class MovieSearchResults implements Iterable<MovieSearchResult> {

    private Integer total;

    private List<MovieSearchResult> movies;

    private Map<String,String> links;

    @XmlAttribute(name="link_template")
    private String linkTemplate;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<MovieSearchResult> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieSearchResult> movies) {
        this.movies = movies;
    }

    public Map<String,String> getLinks() {
        return links;
    }

    public void setLinks(Map<String,String> links) {
        this.links = links;
    }

    public String getLinkTemplate() {
        return linkTemplate;
    }

    public void setLinkTemplate(String linkTemplate) {
        this.linkTemplate = linkTemplate;
    }

    @Override
    public Iterator<MovieSearchResult> iterator() {
        return movies.iterator();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            total,
            movies,
            links,
            linkTemplate
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MovieSearchResults)) {
            return false;
        }
        MovieSearchResults other = (MovieSearchResults)obj;
        return
            Objects.equal(total       , other.total       ) &&
            Objects.equal(movies      , other.movies      ) &&
            Objects.equal(links       , other.links       ) &&
            Objects.equal(linkTemplate, other.linkTemplate);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("total"       , total       )
            .add("movies"      , movies      )
            .add("links"       , links       )
            .add("linkTemplate", linkTemplate)
            .toString();
    }
}
