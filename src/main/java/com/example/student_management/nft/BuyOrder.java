package com.example.student_management.nft;

public class BuyOrder {

    public void processBuyOrder(NftListing listing, String buyer, String amount) {
        // Create a new XRP transaction to send the amount to the seller.
        XrpTransaction transaction = new XrpTransaction();
        transaction.setAccount(buyer);
        transaction.addPayment(listing.getOwner(), listing.getPrice());

        // Send the transaction to the XRPL network.
        xrplClient.sendTransaction(transaction);

        // Update the listing to mark it as sold.
        listing.setSold(true);
    }

}
