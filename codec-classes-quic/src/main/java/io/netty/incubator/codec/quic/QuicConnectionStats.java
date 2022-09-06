/*
 * Copyright 2020 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.incubator.codec.quic;

/**
 * Statistics about the {@code QUIC} connection.
 */
public interface QuicConnectionStats {
    /**
     * @return The number of QUIC packets received on the connection.
     */
    long recv();

    /**
     * @return The number of QUIC packets sent on this connection.
     */
    long sent();

    /**
     * @return The number of QUIC packets that were lost.
     */
    long lost();

    /**
     * @return The number of sent QUIC packets with retransmitted data.
     */
    long retrans();

    /**
     * @return The number of sent bytes.
     */
    long sentBytes();

    /**
     * @return The number of received bytes.
     */
    long recvBytes();

    /**
     * @return  The number of bytes lost.
     */
    long lostBytes();

    /**
     * @return  The number of stream bytes retransmitted.
     */
    long streamRetransBytes();

    /**
     * @return   The number of known paths for the connection.
     */
    long pathsCount();

    /**
     * @return   The maximum idle timeout.
     */
    long peerMaxIdleTimeout();

    /**
     * @return   The maximum UDP payload size.
     */
    long peerMaxUdpPayloadSize();

    /**
     * @return   The initial flow control maximum data for the connection.
     */
    long peerInitialMaxData();

    /**
     * @return   The initial flow control maximum data for local bidirectional streams.
     */
    long peerInitialMaxStreamDataBidiLocal();

    /**
     * @return   The initial flow control maximum data for remote bidirectional streams.
     */
    long peerInitialMaxStreamDataBidiRemote();

    /**
     * @return   The initial flow control maximum data for unidirectional streams.
     */
    long peerInitialMaxStreamDataUni();

    /**
     * @return   The initial maximum bidirectional streams.
     */
    long peerInitialMaxStreamsBidi();

    /**
     * @return   The initial maximum unidirectional streams.
     */
    long peerInitialMaxStreamsUni();

    /**
     * @return   The ACK delay exponent.
     */
    long peerAckDelayExponent();

    /**
     * @return   The max ACK delay.
     */
    long peerMaxAckDelay();

    /**
     * @return    Whether active migration is disabled.
     */
    boolean peerDisableActiveMigration();

    /**
     * @return    The active connection ID limit.
     */
    long peerActiveConnIdLimit();

    /**
     * @return    DATAGRAM frame extension parameter, if any.
     */
    long peerMaxDatagramFrameSize();
}
