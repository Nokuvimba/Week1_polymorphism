package ie.atu.productv5;

import ie.atu.productv2.Software;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data


        Music myMusic = null;
        Tv myTv =null;
        Product p = null;
        if (productCode.equalsIgnoreCase("PINK")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.00);
            p= myMusic;

        } else if (productCode.equalsIgnoreCase("kdl43")) {
            myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTv.setPrice(819.00);

            p= myTv;
        }

        return p;
    }
}

