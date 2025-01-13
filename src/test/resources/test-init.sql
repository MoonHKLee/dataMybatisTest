-- APP_USER 테이블 (ADDRESS 통합)
CREATE TABLE APP_USER
(
    USER_ID  BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME     VARCHAR(100)        NOT NULL,
    EMAIL    VARCHAR(255) UNIQUE NOT NULL,
    STREET   VARCHAR(255), -- ADDRESS 정보
    CITY     VARCHAR(100),
    ZIP_CODE VARCHAR(20)
);

-- ORDERS 테이블
CREATE TABLE ORDERS
(
    ORDER_ID     BIGINT AUTO_INCREMENT PRIMARY KEY,
    ORDER_DATE   DATE           NOT NULL,
    TOTAL_AMOUNT DECIMAL(10, 2) NOT NULL,
    USER_ID      BIGINT         NOT NULL,
    FOREIGN KEY (USER_ID) REFERENCES APP_USER (USER_ID)
);

-- ORDER_ITEM 테이블
CREATE TABLE ORDER_ITEM
(
    ORDER_ITEM_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    PRODUCT_NAME  VARCHAR(255)   NOT NULL,
    QUANTITY      INT            NOT NULL,
    PRICE         DECIMAL(10, 2) NOT NULL,
    ORDER_ID      BIGINT         NOT NULL,
    FOREIGN KEY (ORDER_ID) REFERENCES ORDERS (ORDER_ID)
);

-- APP_USER 데이터 삽입
INSERT INTO APP_USER (NAME, EMAIL, STREET, CITY, ZIP_CODE)
VALUES ('이문혁', 'moonhyuk.lee@example.com', '123 Moon Street', 'Seoul', '12345'),
       ('가윤이', 'gayoon.lee@example.com', '456 Sun Avenue', 'Busan', '67890');

-- ORDERS 데이터 삽입
INSERT INTO ORDERS (ORDER_DATE, TOTAL_AMOUNT, USER_ID)
VALUES ('2025-01-10', 150.00, 1),
       ('2025-01-11', 200.50, 2);

-- ORDER_ITEM 데이터 삽입
INSERT INTO ORDER_ITEM (PRODUCT_NAME, QUANTITY, PRICE, ORDER_ID)
VALUES ('Laptop', 1, 150.00, 1),
       ('Phone', 2, 100.25, 2);
