package com.codesoom.assignment.support;

import com.codesoom.assignment.product.adapter.in.web.dto.ProductRequest;
import com.codesoom.assignment.product.adapter.in.web.dto.ProductResponse;
import com.codesoom.assignment.product.application.port.in.ProductCommand;
import com.codesoom.assignment.product.domain.Product;

public enum ProductFixture {
    TOY_1("범냐옹", "메이드인 코리아", 2000000, "https://avatars.githubusercontent.com/u/59248326"),
    TOY_2("기냐옹", "메이드인 안양", 3000000, "https://avatars.githubusercontent.com/u/59248326"),
    TOY_3("코드숨냐옹", "매이드인 서울", 5000000, null),
    ;

    private final String name;
    private final String maker;
    private final int price;
    private final String imageUrl;

    ProductFixture(String name, String maker, int price, String imageUrl) {
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Product 엔티티_생성() {
        return 엔티티_생성(null);
    }

    public Product 엔티티_생성(final Long id) {
        return Product.builder()
                .id(id)
                .name(name)
                .maker(maker)
                .price(price)
                .imageUrl(imageUrl)
                .build();
    }

    public ProductRequest 요청_데이터_생성() {
        return ProductRequest.builder()
                .name(name)
                .maker(maker)
                .price(price)
                .imageUrl(imageUrl)
                .build();
    }

    public ProductCommand 커맨드_데이터_생성() {
        return ProductCommand.builder()
                .name(name)
                .maker(maker)
                .price(price)
                .imageUrl(imageUrl)
                .build();
    }

    public ProductResponse 응답_데이터_생성(final Long id) {
        return ProductResponse.builder()
                .id(id)
                .name(name)
                .maker(maker)
                .price(price)
                .imageUrl(imageUrl)
                .build();
    }

    public String NAME() {
        return name;
    }

    public String MAKER() {
        return maker;
    }

    public int PRICE() {
        return price;
    }

    public String IMAGE() {
        return imageUrl;
    }
}