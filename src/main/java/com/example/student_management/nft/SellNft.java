package com.example.student_management.nft;

public class SellNft {

    public void createSellOrder(NftListing listing, String seller, String amount) {

        // Create a new XRP transaction to send the NFT to the buyer.
        XrpTransaction transaction = new XrpTransaction();
        transaction.setAccount(seller);
        transaction.addSettlement(listing.getAssetId());

        // Send the transaction to the XRPL network.
        xrplClient.sendTransaction(transaction);

        // Update the listing to mark it as sold.
        listing.setSold(true);
    }

}
