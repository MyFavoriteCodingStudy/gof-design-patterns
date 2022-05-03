package IteratingOverSocialNetworkProfiles.social_networks;

import IteratingOverSocialNetworkProfiles.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
