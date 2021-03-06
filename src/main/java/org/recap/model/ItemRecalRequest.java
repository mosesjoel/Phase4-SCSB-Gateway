package org.recap.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by sudhishk on 15/12/16.
 */
@Getter
@Setter
public class ItemRecalRequest extends AbstractRequestItem {
    private String patronIdentifier;
    private String bibId;
    private String pickupLocation;
}
