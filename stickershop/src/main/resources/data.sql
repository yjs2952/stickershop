-- grade
insert into grade (id, name, sale_money, sale_ratio) values(1, '브론즈', 10000, 0.1);
insert into grade (id, name, sale_money, sale_ratio) values(2, '실버', 15000, 0.15);
insert into grade (id, name, sale_money, sale_ratio) values(3, '골드', 20000, 0.2);

-- member
insert into member (id, password, member_name, email, nickname, address, phone, zip_code, grade_id, mileage)
values ('spring', '{bcrypt}$2a$10$l6rAacvYq13yFz21Hz4z3OUpDGN3hcWvbrcsQFkAq27g2/UkYRSVW', '우주인', 'asd@naver.com', '스프링유저', '경기도 고양시', '010-1234-5678', 12345, 1, 10000);

insert into member (id, address, email, mileage, mod_date, nickname, password, phone, reg_date, member_name, zip_code, grade_id)
values ('springproduct', '서울시 강서구', 'qwe@google.com', 2000, null, '스프링부트유저', '{bcrypt}$2a$10$JrU5xMSHY2zHgxAtLKI3Z.HMEMazraXcBxse4qst6s8TlqnmBcQEG', '010-1111-2222', '2018-11-15 17:53:34', '지구인', 54321, 1);

insert into member (id, address, email, mileage, mod_date, nickname, password, phone, reg_date, member_name, zip_code, grade_id)
values ('jpa', '서울시 강남구', 'zxc@naver.com', 1000, null, 'jpa유저', '{bcrypt}$2a$10$eQ6p574xq6rNE273oxb2BOd9ZtLOQxabD1EF3CuotKhn1zWErmgB.', '010-3212-3456', '2018-11-15 17:57:47', '화성인', 98766, 2);

insert into member (id, address, email, mileage, mod_date, nickname, password, phone, reg_date, member_name, zip_code, grade_id)
values ('object', '서울시 서초구', 'mlk@google.com', 200000, null, '최상위객체', '{bcrypt}$2a$10$OxyvEnzKfrjTiZfaWu2J3.1maIfoGl0y.awT8DOFhvNGQGVITZqpK', '010-3333-1199', '2018-11-15 18:00:21', '나메크성인', 45678, 3);

insert into member (id, address, email, mileage, mod_date, nickname, password, phone, reg_date, member_name, zip_code, grade_id)
values ('admin', '지구 어딘가', 'admin@naver.com', 100000000, null, '신[god]', '{bcrypt}$2a$10$iOnrbWp1ppyymX5OulbkL.kVkHDeuNmKr1So/TKcXmMLPQK1AzMTa', '010-1234-1234', '2018-11-15 18:14:03', '관리자', 11111, null);

-- role
insert into role (id, mod_date, name, reg_date) values (99, null, '관리자', '2018-11-15 18:07:27');
insert into role (id, mod_date, name, reg_date) values (1, null, '사용자', '2018-11-15 18:09:59');

-- member_role
insert into member_roles (member_id, role_id) values ('admin', 99);
insert into member_roles (member_id, role_id) values ('spring', 1);
insert into member_roles (member_id, role_id) values ('springproduct', 1);
insert into member_roles (member_id, role_id) values ('jpa', 1);
insert into member_roles (member_id, role_id) values ('object', 1);

-- coupon
insert into coupon (id, cur_qty, description, expire_date, expire_type, mod_date, name, period, reg_date, sale_money, sale_ratio, total_qty)
values (1, 0, '신규 가입자 대상 2000원 할인 쿠폰', null, 2, null, '신규 가입자 할인 쿠폰', 90, '2018-11-15 18:25:29', 2000, 0, 0);

insert into coupon (id, cur_qty, description, expire_date, expire_type, mod_date, name, period, reg_date, sale_money, sale_ratio, total_qty)
values (2, 0, '등급업 고객 대상 3000원 할인 쿠폰', null, 2, null, '등급업 축하 할인 쿠폰', null, '2018-11-15 18:31:07', 0, 0.1, 0);

insert into coupon (id, cur_qty, description, expire_date, expire_type, mod_date, name, period, reg_date, sale_money, sale_ratio, total_qty)
values (3, 76, '선착순 이벤트 쿠폰', '2018-12-31 23:59:59', 1, null, '이벤트 쿠폰', null, '2018-11-15 18:33:58', 1000, 0, 100);

-- member_coupon
insert into member_coupons (id, expire_date, reg_date, use_check, coupon_id, order_id, member_id) values (1, '2019-02-15 23:59:59', '2018-11-15 19:18:38', 0, 1, null, 'spring');
insert into member_coupons (id, expire_date, reg_date, use_check, coupon_id, order_id, member_id) values (2, '2018-12-31 23:59:59', '2018-11-15 19:18:38', 0, 3, null, 'spring');
insert into member_coupons (id, expire_date, reg_date, use_check, coupon_id, order_id, member_id) values (3, '2019-02-15 23:59:59', '2018-11-15 19:18:38', 1, 1, null, 'jpa');
insert into member_coupons (id, expire_date, reg_date, use_check, coupon_id, order_id, member_id) values (4, null, '2018-11-15 19:18:38', 0, 2, null, 'jpa');
insert into member_coupons (id, expire_date, reg_date, use_check, coupon_id, order_id, member_id) values (5, '2018-12-31 23:59:59', '2018-11-15 19:18:38', 0, 3, null, 'jpa');

-- category
insert into category (id, mod_date, name, reg_date) values (1, null, '개발자', '2018-11-15 19:18:38');
insert into category (id, mod_date, name, reg_date) values (2, null, '캐릭터', '2018-11-15 19:18:38');
insert into category (id, mod_date, name, reg_date) values (3, null, '안내', '2018-11-15 19:18:38');

-- product
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (1, 90, null, '백엔드 개발자 스티커 모음', 8000, '2018-11-15 19:39:01', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (2, 100, null, '프론트 엔드 개발자 스티커 모음', 8000, '2018-11-15 19:39:01', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (3, 100, null, '포켓몬스터 스티커 모음', 10000, '2018-11-15 19:39:01', 50);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (4, 100, null, '뽀로로 스티커 모음', 15000, '2018-11-15 19:39:01', 200);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (5, 30, null, '안내 문구 스티커 모음', 10000, '2018-11-15 19:39:01', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (6, 80, null, '풀스택 개발자 스티커 모음', 15000, '2018-11-15 19:39:01', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (7, 100, null, '자바 개발자 스티커 모음', 10000, '2018-11-19 21:55:02', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (8, 100, null, '파이썬 개발자 스티커 모음', 8000, '2018-11-19 21:55:02', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (9, 100, null, '루비 개발자 스티커 모음', 1000, '2018-11-19 21:55:02', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (10, 100, null, '디지몬 스티커 모음', 5000, '2018-11-19 21:55:02', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (11, 100, null, '건담 스티커 모음', 10000, '2018-11-19 21:55:02', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (12, 100, null, '리눅스 개발자 스티커 모음', 10000, '2018-11-19 21:55:02', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (13, 100, null, '데이터베이스 개발자 스티커 모음', 10000, '2018-11-19 21:55:02', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (14, 100, null, '머신 러닝 개발자 스티커 모음', 12000, '2018-11-19 21:58:16', 100);
INSERT INTO product (id, cur_qty, mod_date, name, price, reg_date, total_qty) VALUES (15, 100, null, '인공지능 개발자 스티커 모음', 11000, '2018-11-19 21:58:16', 100);

-- PRODUCT_CATEGORY
insert into product_categories (product_id, category_id) values (1, 1);
insert into product_categories (product_id, category_id) values (2, 1);
insert into product_categories (product_id, category_id) values (3, 2);
insert into product_categories (product_id, category_id) values (4, 2);
insert into product_categories (product_id, category_id) values (5, 3);
insert into product_categories (product_id, category_id) values (6, 1);
insert into product_categories (product_id, category_id) values (7, 1);
insert into product_categories (product_id, category_id) values (8, 1);
insert into product_categories (product_id, category_id) values (9, 1);
insert into product_categories (product_id, category_id) values (10, 2);
insert into product_categories (product_id, category_id) values (11, 2);
insert into product_categories (product_id, category_id) values (12, 1);
insert into product_categories (product_id, category_id) values (13, 1);
insert into product_categories (product_id, category_id) values (14, 1);
insert into product_categories (product_id, category_id) values (15, 1);

-- ORDER_STATUS
INSERT INTO order_status (id, name) VALUES (1, '결제 확인중');
INSERT INTO order_status (id, name) VALUES (2, '결제 완료');
INSERT INTO order_status (id, name) VALUES (3, '배송 대기중');
INSERT INTO order_status (id, name) VALUES (4, '배송중');
INSERT INTO order_status (id, name) VALUES (5, '배송완료');
INSERT INTO order_status (id, name) VALUES (6, '구매 확정');
INSERT INTO order_status (id, name) VALUES (7, '결제 취소');
INSERT INTO order_status (id, name) VALUES (8, '반품');
INSERT INTO order_status (id, name) VALUES (9, '환불');

-- ORDER_INFO
INSERT INTO order_info (id, reg_date, total_price, order_status_id, shipping_id, member_id) VALUES (1, '2018-11-16 17:08:36', 0, 1, null, 'spring');
INSERT INTO order_info (id, reg_date, total_price, order_status_id, shipping_id, member_id) VALUES (2, '2018-11-16 17:08:36', 0, 2, null, 'springproduct');
INSERT INTO order_info (id, reg_date, total_price, order_status_id, shipping_id, member_id) VALUES (3, '2018-11-16 17:08:36', 0, 3, null, 'jpa');
INSERT INTO order_info (id, reg_date, total_price, order_status_id, shipping_id, member_id) VALUES (4, '2018-11-16 17:08:36', 0, 4, null, 'object');
INSERT INTO order_info (id, reg_date, total_price, order_status_id, shipping_id, member_id) VALUES (5, '2018-11-16 17:11:58', 0, 2, null, 'spring');
INSERT INTO order_info (id, reg_date, total_price, order_status_id, shipping_id, member_id) VALUES (6, '2018-11-16 17:11:58', 0, 3, null, 'jpa');

-- ORDER_INFO_PRODUCTS
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (6, 80, '백엔드 개발자 스티커 모음', 8000, 1, 1, 1);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (7, 80, '프론트 엔드 개발자 스티커 모음', 8000, 1, 2, 1);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (8, 100, '포켓몬스터 스티커 모음', 10000, 2, 3, 2);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (9, 150, '풀스택 개발자 스티커 모음', 15000, 1, 6, 2);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (10, 100, '안내 문구 스티커 모음', 10000, 3, 5, 2);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (11, 80, '백엔드 개발자 스티커 모음', 8000, 2, 1, 3);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (12, 80, '프론트 엔드 개발자 스티커 모음', 8000, 3, 2, 3);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (13, 100, '뽀로로 스티커 모음', 10000, 2, 4, 4);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (14, 100, '포켓몬스터 스티커 모음', 10000, 1, 3, 4);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (15, 80, '백엔드 개발자 스티커 모음', 8000, 1, 1, 5);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (16, 80, '프론트 엔드 개발자 스티커 모음', 8000, 1, 2, 5);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (17, 150, '풀스택 개발자 스티커 모음', 15000, 1, 6, 5);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (18, 100, '포켓몬스터 스티커 모음', 10000, 4, 3, 6);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (19, 100, '뽀로로 스티커 모음', 10000, 3, 4, 6);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (20, 150, '풀스택 개발자 스티커 모음', 15000, 2, 6, 6);
INSERT INTO order_info_products (id, mileage, name, price, quantity, product_id, order_id) VALUES (21, 100, '안내 문구 스티커 모음', 10000, 5, 5, 6);

-- SHIPPING
INSERT INTO shipping (id, address, fee, memo, phone, member_name, zip_code) VALUES (1, '고양시 어딘가', 2500, '부재시 경비실에 맡겨주세요.', '010-1234-5678', '우주인', 12345);
INSERT INTO shipping (id, address, fee, memo, phone, member_name, zip_code) VALUES (2, '서울시 강서구', 2500, '빠른 배송 부탁드립니다.', '010-1111-2222', '지구인', 54321);
INSERT INTO shipping (id, address, fee, memo, phone, member_name, zip_code) VALUES (3, '서울시 강남구', 2500, '부재시 경비실에...', '010-3212-3456', '화성인', 98766);
INSERT INTO shipping (id, address, fee, memo, phone, member_name, zip_code) VALUES (4, '서울시 서초구', 2500, '경비실에 맡겨주세요.', '010-1212-3434', '나메크성인', 45678);
INSERT INTO shipping (id, address, fee, memo, phone, member_name, zip_code) VALUES (5, '고양시 어딘가', 2500, '초인종 누르지 말고 노크해주세요.', '010-1234-5678', '우주인', 12345);
INSERT INTO shipping (id, address, fee, memo, phone, member_name, zip_code) VALUES (6, '서울시 강남구', 2500, '빠른 배송....', '010-3212-3456', '화성인', 98766);