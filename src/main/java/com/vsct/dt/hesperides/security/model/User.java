/*
 *
 *  * This file is part of the Hesperides distribution.
 *  * (https://github.com/voyages-sncf-technologies/hesperides)
 *  * Copyright (c) 2016 VSCT.
 *  *
 *  * Hesperides is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as
 *  * published by the Free Software Foundation, version 3.
 *  *
 *  * Hesperides is distributed in the hope that it will be useful, but
 *  * WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  * General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package com.vsct.dt.hesperides.security.model;

/**
 * Created by william_montaz on 12/11/2014.
 */
public class User {
    /**
     * Convenient 'untracked user' information
     */
    public static final User UNTRACKED = new User("untracked", false);

    private final String  username;
    private final boolean isProdUser;

    public User(final String username, boolean isProdUser) {
        this.username = username;
        this.isProdUser = isProdUser;
    }

    public String getUsername() {
        return username;
    }

    public boolean isProdUser() {
        return isProdUser;
    }
}
