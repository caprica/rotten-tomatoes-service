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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 *
 */
public final class Ratings {

    @JsonProperty("critics_rating")
    private String criticsRating;

    @JsonProperty("critics_score")
    private Integer criticsScore;

    @JsonProperty("audience_rating")
    private String audienceRating;

    @JsonProperty("audience_score")
    private Integer audienceScore;

    public String getCriticsRating() {
        return criticsRating;
    }

    public void setCriticsRating(String criticsRating) {
        this.criticsRating = criticsRating;
    }

    public Integer getCriticsScore() {
        return criticsScore;
    }

    public void setCriticsScore(Integer criticsScore) {
        this.criticsScore = criticsScore;
    }

    public String getAudienceRating() {
        return audienceRating;
    }

    public void setAudienceRating(String audienceRating) {
        this.audienceRating = audienceRating;
    }

    public Integer getAudienceScore() {
        return audienceScore;
    }

    public void setAudienceScore(Integer audienceScore) {
        this.audienceScore = audienceScore;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            criticsRating,
            criticsScore,
            audienceRating,
            audienceScore
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ratings)) {
            return false;
        }
        Ratings other = (Ratings)obj;
        return
            Objects.equal(criticsRating , other.criticsRating ) &&
            Objects.equal(criticsScore  , other.criticsScore  ) &&
            Objects.equal(audienceRating, other.audienceRating) &&
            Objects.equal(audienceScore , other.audienceScore );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("criticsRating" , criticsRating )
            .add("criticsScore"  , criticsScore  )
            .add("audienceRating", audienceRating)
            .add("audienceScore" , audienceScore )
            .toString();
    }
}
