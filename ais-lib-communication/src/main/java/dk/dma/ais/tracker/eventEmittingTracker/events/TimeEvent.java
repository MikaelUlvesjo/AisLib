/* Copyright (c) 2011 Danish Maritime Authority
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */

package dk.dma.ais.tracker.eventEmittingTracker.events;

import com.google.common.base.Objects;

/**
 * TimeEvent is a special type of TrackerEvent which is emitted at periodic intervals in the AIS data stream.
 * The exact period can be configured in the Tracker.
 */
public class TimeEvent extends TrackerEvent {

    private final long timestamp;
    private final int millisSinceLastMark;

    public TimeEvent(long timestamp, int millisSinceLastMark) {
        this.timestamp = timestamp;
        this.millisSinceLastMark = millisSinceLastMark;
    }

    public final long getTimestamp() {
        return timestamp;
    }

    public int getMillisSinceLastMark() {
        return millisSinceLastMark;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("timestamp", timestamp)
                .add("millisSinceLastMark", millisSinceLastMark)
                .toString();
    }
}
