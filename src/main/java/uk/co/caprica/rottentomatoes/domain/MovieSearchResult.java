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
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 *
 */
public final class MovieSearchResult {

    private Integer id;

    private String title;

    private Integer year;

    @JsonProperty("mpaa_rating")
    private String mpaaRating;

    private Integer runtime;

    @JsonProperty("critics_consensus")
    private String criticsConsensus;

    @JsonProperty("release_dates")
    private ReleaseDates releaseDates;

    private Ratings ratings;

    private String synopsis;

    private Map<String,String> posters;

    @JsonProperty("abridged_cast")
    private List<Cast> abridgedCast;

    @JsonProperty("alternate_ids")
    private Map<String,Object> alternateIds;

    private Map<String,String> links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getCriticsConsensus() {
        return criticsConsensus;
    }

    public void setCriticsConsensus(String criticsConsensus) {
        this.criticsConsensus = criticsConsensus;
    }

    public ReleaseDates getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(ReleaseDates releaseDates) {
        this.releaseDates = releaseDates;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Map<String,String> getPosters() {
        return posters;
    }

    public void setPosters(Map<String,String> posters) {
        this.posters = posters;
    }

    public List<Cast> getAbridgedCast() {
        return abridgedCast;
    }

    public void setAbridgedCast(List<Cast> abridgedCast) {
        this.abridgedCast = abridgedCast;
    }

    public Map<String,Object> getAlternateIds() {
        return alternateIds;
    }

    public void setAlternateIds(Map<String,Object> alternateIds) {
        this.alternateIds = alternateIds;
    }

    public Map<String,String> getLinks() {
        return links;
    }

    public void setLinks(Map<String,String> links) {
        this.links = links;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            id,
            title,
            year,
            mpaaRating,
            runtime,
            criticsConsensus,
            releaseDates,
            ratings,
            synopsis,
            posters,
            abridgedCast,
            alternateIds,
            links);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MovieSearchResult)) {
            return false;
        }
        MovieSearchResult other = (MovieSearchResult)obj;
        return
            Objects.equal(id              , other.id              ) &&
            Objects.equal(title           , other.title           ) &&
            Objects.equal(year            , other.year            ) &&
            Objects.equal(mpaaRating      , other.mpaaRating      ) &&
            Objects.equal(runtime         , other.runtime         ) &&
            Objects.equal(criticsConsensus, other.criticsConsensus) &&
            Objects.equal(releaseDates    , other.releaseDates    ) &&
            Objects.equal(ratings         , other.ratings         ) &&
            Objects.equal(synopsis        , other.synopsis        ) &&
            Objects.equal(posters         , other.posters         ) &&
            Objects.equal(abridgedCast    , other.abridgedCast    ) &&
            Objects.equal(alternateIds    , other.alternateIds    ) &&
            Objects.equal(links           , other.links           );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("id"              , id              )
            .add("title"           , title           )
            .add("year"            , year            )
            .add("mpaaRating"      , mpaaRating      )
            .add("runtime"         , runtime         )
            .add("criticsConsensus", criticsConsensus)
            .add("releaseDates"    , releaseDates    )
            .add("ratings"         , ratings         )
            .add("synopsis"        , synopsis        )
            .add("posters"         , posters         )
            .add("abridgedCast"    , abridgedCast    )
            .add("alternateIds"    , alternateIds    )
            .add("links"           , links           )
            .toString();
    }
}
