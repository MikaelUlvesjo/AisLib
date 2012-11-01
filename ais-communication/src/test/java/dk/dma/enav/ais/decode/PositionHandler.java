package dk.dma.enav.ais.decode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.dma.enav.ais.message.AisMessage;
import dk.dma.enav.ais.message.AisPositionMessage;
import dk.dma.enav.messaging.MessageHandler;
import dk.dma.enav.messaging.MessageMetadata;

public class PositionHandler implements MessageHandler<AisMessage> {

    private static final Logger LOG = LoggerFactory.getLogger(PositionHandler.class);

    /**
     * Method to handle incoming AIS messages
     * 
     * For debug out adjust log4j.xml level
     */
    public void process(AisMessage aisMessage, MessageMetadata medatadata) {
        // Ignore everything but position reports
        if (aisMessage.getMsgId() > 3) {
            return;
        }

        // Just consider the position part
        AisPositionMessage aisPosMessage = (AisPositionMessage) aisMessage;
        LOG.debug(aisPosMessage.toString());

    }

}
