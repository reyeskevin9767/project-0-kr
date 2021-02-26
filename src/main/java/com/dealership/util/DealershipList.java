package com.dealership.util;

import com.dealership.model.User;

public abstract class DealershipList extends DealershipCollection{

    public abstract void order();
    public abstract int indexOf(User u);

}
