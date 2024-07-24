package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) throws IOException {

        Set<Product> productSet = new HashSet<>();
        BufferedReader br = null;
        String line;
        String path = "resources/data.csv";
        List<Product> myProducts = new ArrayList<>();

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));

            // TODO: 상품 클래스를 생성하여 상품목록에 넣는다.
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");

                Product product = new Product(temp[0], temp[1], Integer.parseInt(temp[2]));
                productSet.add(product);
                myProducts.add(product);
            }

        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        System.out.println("고유한 상품 목록:");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        Cart myCart = new Cart();

        // TODO: 상품을 장바구니에 추가
        myCart.addProduct(myProducts.get(0), 1);
        myCart.addProduct(myProducts.get(1), 2);

        // TODO: 상품을 장바구니에서 제거
        myCart.removeProduct(myProducts.get(0), 1);
        myCart.removeProduct(myProducts.get(1), 1);

        // TODO: 장바구니에 현재 담긴 상품들을 출력 (상품이름, 각 상품의 갯수)
        System.out.println(myCart.showItemsStream());

        // 추가 테스트
        System.out.println("remove again");
        myCart.removeProduct(myProducts.get(0), 1);
        myCart.showItems();
    }
}
