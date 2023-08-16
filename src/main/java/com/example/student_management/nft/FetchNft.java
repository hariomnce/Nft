package com.example.student_management.nft;

public class FetchNft {

    public List<NftListing> fetchNftListings() {
        List<NftListing> listings = new ArrayList<>();

        // Get the list of all assets on the XRPL.
        List<XrpAsset> assets = xrplClient.getAssets();

        // Iterate through the assets and find the ones that are NFTs.
        for (XrpAsset asset : assets) {
            if (asset.isNonFungible()) {
                // Create a new NftListing object for the asset.
                NftListing listing = new NftListing();
                listing.setAssetId(asset.getAssetId());
                listing.setOwner(asset.getOwner());
                listing.setPrice(asset.getAmount());

                // Add the NftListing object to the list of listings.
                listings.add(listing);
            }
        }
        return listings;
    }

}
