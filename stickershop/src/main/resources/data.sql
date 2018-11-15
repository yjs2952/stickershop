-- grade
insert into grade (id, name, sale_money, sale_ratio) values(1, '브론즈', 10000, 0.1);
insert into grade (id, name, sale_money, sale_ratio) values(2, '실버', 15000, 0.15);
insert into grade (id, name, sale_money, sale_ratio) values(3, '골드', 20000, 0.2);

-- user
insert into user (id, password, user_name, email, nickname, address, phone, zip_code, grade_id, mileage)
values ('spring', '1234', '우주인', 'asd@naver.com', '스프링유저', '경기도 고양시', '010-1234-5678', 12345, 1, 10000);

insert into user (id, address, email, mileage, mod_date, nickname, password, phone, reg_date, user_name, zip_code, grade_id)
values ('springboot', '서울시 강서구', 'qwe@google.com', 2000, null, '스프링부트유저', '1234', '010-1111-2222', '2018-11-15 17:53:34', '지구인', 54321, 1);

insert into user (id, address, email, mileage, mod_date, nickname, password, phone, reg_date, user_name, zip_code, grade_id)
values ('jpa', '서울시 강남구', 'zxc@naver.com', 1000, null, 'jpa유저', '1234', '010-3212-3456', '2018-11-15 17:57:47', '화성인', 98766, 2);

insert into user (id, address, email, mileage, mod_date, nickname, password, phone, reg_date, user_name, zip_code, grade_id)
values ('object', '서울시 서초구', 'mlk@google.com', 200000, null, '최상위객체', '1234', '010-3333-1199', '2018-11-15 18:00:21', '나메크성인', 45678, 3);

insert into user (id, address, email, mileage, mod_date, nickname, password, phone, reg_date, user_name, zip_code, grade_id)
values ('admin', '지구 어딘가', 'admin@naver.com', 100000000, null, '신[god]', '1111', '010-1234-1234', '2018-11-15 18:14:03', '관리자', 11111, null);

-- role
insert into role (id, mod_date, name, reg_date) values (99, null, '관리자', '2018-11-15 18:07:27');
insert into role (id, mod_date, name, reg_date) values (1, null, '사용자', '2018-11-15 18:09:59');

-- user_role
insert into user_role (user_id, role_id) values ('admin', 99);
insert into user_role (user_id, role_id) values ('spring', 1);
insert into user_role (user_id, role_id) values ('springboot', 1);
insert into user_role (user_id, role_id) values ('jpa', 1);
insert into user_role (user_id, role_id) values ('object', 1);

-- coupon
insert into coupon (id, cur_qty, description, expire_date, expire_type, mod_date, name, period, reg_date, sale_money, sale_ratio, total_qty)
values (1, 0, '신규 가입자 대상 2000원 할인 쿠폰', null, 2, null, '신규 가입자 할인 쿠폰', 90, '2018-11-15 18:25:29', 2000, 0, 0);

insert into coupon (id, cur_qty, description, expire_date, expire_type, mod_date, name, period, reg_date, sale_money, sale_ratio, total_qty)
values (2, 0, '등급업 고객 대상 3000원 할인 쿠폰', null, 2, null, '등급업 축하 할인 쿠폰', null, '2018-11-15 18:31:07', 0, 0.1, 0);

insert into coupon (id, cur_qty, description, expire_date, expire_type, mod_date, name, period, reg_date, sale_money, sale_ratio, total_qty)
values (3, 76, '선착순 이벤트 쿠폰', '2018-12-31 23:59:59', 1, null, '이벤트 쿠폰', null, '2018-11-15 18:33:58', 1000, 0, 100);

-- user_coupon
insert into user_coupon (id, expire_date, reg_date, use_check, coupon_id, order_id, user_id) values (1, '2019-02-15 23:59:59', '2018-11-15 19:18:38', 0, 1, null, 'spring');
insert into user_coupon (id, expire_date, reg_date, use_check, coupon_id, order_id, user_id) values (2, '2018-12-31 23:59:59', '2018-11-15 19:18:38', 0, 3, null, 'spring');
insert into user_coupon (id, expire_date, reg_date, use_check, coupon_id, order_id, user_id) values (3, '2019-02-15 23:59:59', '2018-11-15 19:18:38', 1, 1, null, 'jpa');
insert into user_coupon (id, expire_date, reg_date, use_check, coupon_id, order_id, user_id) values (4, null, '2018-11-15 19:18:38', 0, 2, null, 'jpa');
insert into user_coupon (id, expire_date, reg_date, use_check, coupon_id, order_id, user_id) values (5, '2018-12-31 23:59:59', '2018-11-15 19:18:38', 0, 3, null, 'jpa');

-- category
insert into category (id, mod_date, name, reg_date) values (1, null, '개발자', '2018-11-15 19:18:38');
insert into category (id, mod_date, name, reg_date) values (2, null, '캐릭터', '2018-11-15 19:18:38');
insert into category (id, mod_date, name, reg_date) values (3, null, '안내', '2018-11-15 19:18:38');

-- product
insert into product (id, cur_qty, mod_date, name, price, reg_date, total_qty, order_id) values (1, 90, null, '백엔드 개발자 스티커 모음', 8000, '2018-11-15 19:39:01', 100, null);
insert into product (id, cur_qty, mod_date, name, price, reg_date, total_qty, order_id) values (2, 100, null, '프론트 엔드 개발자 스티커 모음', 8000, '2018-11-15 19:39:01', 100, null);
insert into product (id, cur_qty, mod_date, name, price, reg_date, total_qty, order_id) values (3, 100, null, '포켓몬스터 스티커 모음', 10000, '2018-11-15 19:39:01', 50, null);
insert into product (id, cur_qty, mod_date, name, price, reg_date, total_qty, order_id) values (4, 100, null, '뽀로로 스티커 모음', 15000, '2018-11-15 19:39:01', 200, null);
insert into product (id, cur_qty, mod_date, name, price, reg_date, total_qty, order_id) values (5, 30, null, '안내 문구 스티커 모음', 10000, '2018-11-15 19:39:01', 100, null);
insert into product (id, cur_qty, mod_date, name, price, reg_date, total_qty, order_id) values (6, 80, null, '풀스택 개발자 스티커 모음', 15000, '2018-11-15 19:39:01', 100, null);

-- product_category
insert into product_category (product_id, category_id) values (1, 1);
insert into product_category (product_id, category_id) values (2, 1);
insert into product_category (product_id, category_id) values (3, 2);
insert into product_category (product_id, category_id) values (4, 2);
insert into product_category (product_id, category_id) values (5, 3);
insert into product_category (product_id, category_id) values (6, 1);

