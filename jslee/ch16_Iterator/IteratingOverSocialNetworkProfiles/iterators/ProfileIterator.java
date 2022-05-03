package IteratingOverSocialNetworkProfiles.iterators;

import IteratingOverSocialNetworkProfiles.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}