create database cinema

use cinema
go

create table account(
	username nchar(8) primary key,
	user_password nchar(30),
	trang_thai bit,
	vo_hieu_hoa bit
	)


insert into account values ('NV0001','74644329',0,0)
insert into account values ('NV0002','74644330',0,0)
insert into account values ('NV0003','74644331',0,0) 
insert into account values ('NV0004','74644332',0,0) 
insert into account values ('NV0005','74644333',0,0) 
insert into account values ('NV0006','74644334',0,0) 
insert into account values ('NV0007','74644335',0,0) 
insert into account values ('NV0008','74644336',0,0) 
insert into account values ('NV0009','74644337',0,0) 
insert into account values ('NV0010','-1980993049',0,0) 
insert into account values ('NV0011','-1980993048',0,0) 
insert into account values ('NV0012','-1980993047',0,0) 
insert into account values ('NV0013','-1980993046',0,0) 
insert into account values ('NV0014','-1980993045',0,0) 
insert into account values ('NV0015','-1980993044',0,0) 
insert into account values ('NV0016','-1980993043',0,0) 
insert into account values ('NV0017','-1980993042',0,0) 
insert into account values ('NV0018','-1980993041',0,0) 
insert into account values ('NV0019','-1980993040',0,0) 
insert into account values ('NV0020','-1980993018',0,0) 

select * from account 
update account set vo_hieu_hoa = 0 where username = 'NV0010'
update account set trang_thai = 0 where username = 'NV0001'
delete account where username = 'NV006'
drop table account

---------------------------------------------------------------------------------------------------

create table nhanvien(
	stt int identity(1,1),
	ma_nhan_vien nchar(8) primary key,
	hoten nvarchar(50),
	ngaysinh date,
	gioitinh nvarchar(3),
	email nchar(30),
	sdt nchar(10),
	diachi nvarchar(50),
	trangthai nvarchar(20),
	username nchar(8),
	chucvu nvarchar(50),
	admission date,
	constraint fk_nhanvien_account foreign key(username) references account(username)
	)



insert into nhanvien values ('NV0001', N'Cái Thế Đức Anh','1991-08-27','nam','anh@gmail.com','0123456789','somewhere',N'còn làm','NV0001',N'Quản trị viên','2015-08-09')
insert into nhanvien values ('NV0002', N'Đào Thái Bảo','1994-03-19','nam','bao@gmail.com','1564895231','somewhere',N'còn làm','NV0002',N'Quản trị viên','2016-09-09')
insert into nhanvien values ('NV0003', N'Đinh Ngọc Xuân Quỳnh','1990-11-07',N'nữ','quynh@gmail.com','4978643152','somewhere',N'còn làm','NV0003',N'Quản trị viên','2017-02-27')
insert into nhanvien values ('NV0004', N'Hồ Ngọc Huân','1993-09-12','nam','huan@gmail.com','4978761320','somewhere',N'còn làm','NV0004',N'Nhân viên quản lý phòng chiếu','2018-11-11')
insert into nhanvien values ('NV0005', N'Nguyễn Thị Hà Khuê','1992-10-02',N'nữ','khue@gmail.com','1326497856','somewhere',N'còn làm','NV0005',N'Nhân viên quản lý phòng chiếu','2016-12-22')
insert into nhanvien values ('NV0006', N'Đinh Thị Thanh Huyền','1990-09-15',N'nữ','huyen@gmail.com','1326497856','somewhere',N'còn làm','NV0006',N'Nhân viên bán vé','2017-08-09')
insert into nhanvien values ('NV0007', N'Nguyễn Đình Minh Khôi','1992-08-10',N'nam','khoi@gmail.com','1328917856','somewhere',N'còn làm','NV0007',N'Nhân viên bán vé','2016-08-09')
insert into nhanvien values ('NV0008', N'Trần Đức Linh','1992-09-17',N'nữ','linh@gmail.com','1326497856','somewhere',N'còn làm','NV0008',N'Nhân viên quản lý phòng chiếu','2015-09-09')
insert into nhanvien values ('NV0009', N'Mai Xuân Mẫn','1992-11-08',N'nữ','man@gmail.com','1326414756','somewhere',N'còn làm','NV0009',N'Nhân viên quản lý phim','2015-11-12')
insert into nhanvien values ('NV0010', N'Hồ Hoàng Hảo','1993-07-21','nam','hao@gmail.com','1321477856','somewhere',N'còn làm','NV0010',N'Nhân viên chăm sóc khách hàng','2015-09-17')
insert into nhanvien values ('NV0011', N'Lê Như Hiền','1991-10-11',N'nữ','hien@gmail.com','1326978856','somewhere',N'còn làm','NV0011',N'Nhân viên quản lý phim','2016-03-17')
insert into nhanvien values ('NV0012', N'Võ Thị Phước Ngọc','1990-08-27',N'nữ','ngoc@gmail.com','1326499876','somewhere',N'còn làm','NV0012',N'Nhân viên bán vé','2015-08-09')
insert into nhanvien values ('NV0013', N'Phan Văn Bảo Khang','1995-06-02','nam','khang@gmail.com','1147497856','somewhere',N'còn làm','NV0013',N'Nhân viên quản lý lịch chiếu','2014-04-25')
insert into nhanvien values ('NV0014', N'Lê Thị Thu Hiền','1994-05-04',N'nữ','hien@gmail.com','1326497335','somewhere',N'còn làm','NV0014',N'Nhân viên quản lý lịch chiếu','2018-07-15')
insert into nhanvien values ('NV0015', N'Nguyễn Bảo Ngọc','1991-10-02',N'nữ','ngoc@gmail.com','1326497367','somewhere',N'còn làm','NV0015',N'Nhân viên giám sát','2017-10-1')
insert into nhanvien values ('NV0016', N'Lê Thị Mỹ Huỳnh','1992-03-07',N'nữ','huynh@gmail.com','1326436756','somewhere',N'còn làm','NV0016',N'Nhân viên giám sát','2015-09-12')
insert into nhanvien values ('NV0017', N'Huỳnh Công Đức','1991-10-19','nam','duc@gmail.com','1326420856','somewhere',N'còn làm','NV0017',N'Nhân viên chăm sóc khách hàng','2015-08-16')
insert into nhanvien values ('NV0018', N'Vũ Như Thành','1993-02-11','nam','thanh@gmail.com','1397497856','somewhere',N'còn làm','NV0018',N'Nhân viên chăm sóc khách hàng','2015-08-09')
insert into nhanvien values ('NV0019', N'Nguyễn Đắc Nhân','1991-11-09','nam','nhan@gmail.com','1326497856','somewhere',N'còn làm','NV0019',N'Nhân viên kinh doanh','2015-08-09')
insert into nhanvien values ('NV0020', N'Trần Hoàng Thảo Bình','1996-01-07',N'nữ','binh@gmail.com','1326497856','somewhere',N'còn làm','NV0020',N'Nhân viên chăm sóc khách hàng','2018-05-09')


select * from nhanvien

---------------------------------------------------------------------------------------------------

create table thanhvien(
	stt int identity(1,1),
	ma_thanh_vien nchar(10) primary key,
	hoten nvarchar(50),
	ngaysinh date,
	gioitinh nvarchar(3),
	email nchar(30),
	sdt nchar(10),
	diachi nvarchar(50),
	loai nvarchar(6)
	)

insert into thanhvien values ('KH78579922', N'Nguyễn Thị Hương',	'1989-05-04', N'nữ','huong@gmail.com','0123456789','somewhere','VIP')
insert into thanhvien values ('KH49914715', N'Phạm Hoài Anh','1992-03-05','nam','anh1@gmail.com','1564895231','somewhere','VIP')
insert into thanhvien values ('KH99133496', N'Phạm Mai Anh','1994-12-26',N'nữ','anh2@gmail.com','4978643152','somewhere',N'Thường')
insert into thanhvien values ('KH42424669', N'Trần Duy Anh','1993-10-06','nam','anh3@gmail.com','4978761320','somewhere',N'Thường')
insert into thanhvien values ('KH91295215', N'Trần Văn Anh','1990-01-07','nam','anh4@gmail.com','1326497856','somewhere',N'Thường')
insert into thanhvien values ('KH81817816', N'Vũ Tuấn Anh','1992-09-02','nam','anh5@gmail.com','1326287856','somewhere',N'Thường')
insert into thanhvien values ('KH87271140', N'Nguyễn Ngọc Cương','1993-05-19','nam','cuong@gmail.com','1328917856','somewhere',N'Thường')
insert into thanhvien values ('KH46163013', N'Phạm Văn Diệu','1993-05-23','nam','dieu@gmail.com','1326497856','somewhere',N'Thường')
insert into thanhvien values ('KH68350410', N'Nguyễn Hoàng Dũng','1990-12-30','nam','dung@gmail.com','1326414756','somewhere',N'Thường')
insert into thanhvien values ('KH07942366', N'Nguyễn Công Dương','1993-01-09','nam','duong@gmail.com','1321477856','somewhere',N'Thường')
insert into thanhvien values ('KH00048840', N'Phạm Quang Đạo','1992-06-05',N'nữ','dao@gmail.com','1726978856','somewhere',N'Thường')
insert into thanhvien values ('KH63093439', N'Triệu Trọng Đạt','1994-03-16',N'nữ','dat@gmail.com','1326499876','somewhere',N'Thường')
insert into thanhvien values ('KH82172703', N'Lê Thị Thu Hà','1991-05-01','nam','ha1@gmail.com','1147497856','somewhere',N'Thường')
insert into thanhvien values ('KH00586305', N'Trần Thị Hà','1991-12-07',N'nữ','ha2@gmail.com','1326497335','somewhere',N'Thường')
insert into thanhvien values ('KH17765059', N'Bùi Văn Hải','1993-11-19',N'nữ','hai1@gmail.com','1326497367','somewhere','VIP')
insert into thanhvien values ('KH13049288', N'Đỗ Văn Hải','1992-07-01','nam','hai2@gmail.com','1326436756','somewhere','VIP')
insert into thanhvien values ('KH40395203', N'Nguyễn Văn Hải','1992-06-08','nam','hai3@gmail.com','1326420856','somewhere',N'Thường')
insert into thanhvien values ('KH40159948', N'Dương Thị Hào','1994-12-01',N'nữ','hao@gmail.com','1397497856','somewhere',N'Thường')
insert into thanhvien values ('KH75274441', N'Nguyễn Thị Hiền','1991-06-13',N'nữ','hien@gmail.com','1326497856','somewhere',N'Thường')
insert into thanhvien values ('KH95061515', N'Vũ Thế Hiếu','1994-11-29','nam','hieu@gmail.com','1326497856','somewhere',N'Thường')
insert into thanhvien values ('KH31304120', N'Trần Đức Hòa',	'1992-06-17', 'nam','hoa@gmail.com','1723456789','somewhere','VIP')
insert into thanhvien values ('KH22355891', N'Nguyễn Huy Hoàng','1993-10-02','nam','hoang@gmail.com','1564895231','somewhere','VIP')
insert into thanhvien values ('KH04191028', N'Trần Huy Hoàng','1991-09-27','nam','hoang1@gmail.com','4978643152','somewhere',N'Thường')
insert into thanhvien values ('KH33125884', N'Đào Thị Huệ','1994-11-14',N'nữ','hue@gmail.com','4978761320','somewhere',N'Thường')
insert into thanhvien values ('KH80416826', N'Nguyễn Hữu Hùng','1991-02-10','nam','hung@gmail.com','1326497856','somewhere',N'Thường')
insert into thanhvien values ('KH66667351', N'Nguyễn Trọng Huy','1991-02-18','nam','huy@gmail.com','1326497856','somewhere',N'Thường')
insert into thanhvien values ('KH18131610', N'Đỗ Ngọc Huyên','1991-11-08','nam','huyen@gmail.com','1328917856','somewhere',N'Thường')
insert into thanhvien values ('KH84911074', N'Lê Thị Thu Huyền','1992-11-20',N'nữ','huyen1@gmail.com','1326497856','somewhere',N'Thường')
insert into thanhvien values ('KH75278648', N'Nguyễn Thị Huyền','1992-11-21',N'nữ','huyen2@gmail.com','1326414756','somewhere',N'Thường')
insert into thanhvien values ('KH27585285', N'Phan Thị Thu Huyền','1993-04-26',N'nữ','huyen3@gmail.com','1321477856','somewhere',N'Thường')
insert into thanhvien values ('KH00456469', N'Hoàng Xuân Khánh','1991-05-19','nam','khanh@gmail.com','1326978856','somewhere','VIP')
insert into thanhvien values ('KH07360350', N'Đỗ Trọng Khôi','1992-01-27','nam','khoi@gmail.com','1326499876','somewhere','VIP')
insert into thanhvien values ('KH98154329', N'Dương Mạnh Kỳ','1994-07-23','nam','ky@gmail.com','1147497856','somewhere',N'Thường')
insert into thanhvien values ('KH44764623', N'Nguyễn Việt Linh','1993-08-08','nam','linh@gmail.com','1326497335','somewhere',N'Thường')
insert into thanhvien values ('KH85706639', N'Vũ Thị Mỹ Linh','1994-06-27',N'nữ','linh@gmail.com','1326497367','somewhere',N'Thường')
insert into thanhvien values ('KH45624152', N'Bùi Thị Loan','1992-03-26',N'nữ','loan@gmail.com','1326436756','somewhere',N'Thường')
insert into thanhvien values ('KH54283062', N'Trịnh Thị Loan','1993-05-10',N'nữ','loan1@gmail.com','1326420856','somewhere',N'Thường')
insert into thanhvien values ('KH06441905', N'Vũ Hồng Loan','1993-05-20',N'nữ','loan2@gmail.com','1397497856','somewhere',N'Thường')
insert into thanhvien values ('KH47988087', N'Đỗ Hoàng Long','1991-06-28','nam','long@gmail.com','1326497856','somewhere',N'Thường')
insert into thanhvien values ('KH72536005', N'Nguyễn Danh Long','1992-07-10','nam','long@gmail.com','1326497856','somewhere',N'Thường')

select * from thanhvien order by stt
---------------------------------------------------------------------------------------------------

create table nhan(
	ma_nhan nchar(3) primary key,
	mo_ta nvarchar(100)
	)
	
insert into nhan values ('P',N'Phù hợp với khán giả mọi lứa tuổi')
insert into nhan values ('C13',N'Phù hợp với khán giả từ 13 tuổi trở lên')
insert into nhan values ('C16',N'Phù hợp với khán giả từ 16 tuổi trở lên')
insert into nhan values ('C18',N'Phù hợp với khán giả từ 18 tuổi trở lên')


---------------------------------------------------------------------------------------------------

create table dinhdang(
	ma_dinh_dang nchar(2) primary key,
	mo_ta nvarchar(30)
	)

insert into dinhdang values ('2D','Định dạng phim thường')
insert into dinhdang values ('3D','Định dạng phim sắc nét')
insert into dinhdang values ('4D','Định dạng phim cực sắt nét')

---------------------------------------------------------------------------------------------------

create table rap(
	ma_rap nchar(5) primary key,
	so_hang int,
	so_cot int,
	ma_dinh_dang nchar(2),

	constraint fk_rap_dinhdang foreign key(ma_dinh_dang) references dinhdang(ma_dinh_dang)
	)

insert into rap values ('RAP01',10,10,'2D')
insert into rap values ('RAP02',10,10,'3D')
insert into rap values ('RAP03',10,10,'2D')
insert into rap values ('RAP04',10,10,'3D')
insert into rap values ('RAP05',10,10,'2D')
insert into rap values ('RAP06',10,10,'4D')

---------------------------------------------------------------------------------------------------

create table phim(
	ma_phim nchar(10) primary key,
	tenphim nvarchar(50),
	anh_dai_dien image,
	the_loai nvarchar(30),
	quoc_gia nvarchar(20),
	thoi_luong nvarchar(10),
	khoi_chieu date,
	ngon_ngu nvarchar(50),
	dao_dien nvarchar(100),
	nha_san_xuat nvarchar(100),
 	dien_vien_chinh nvarchar(200),
	noidung nvarchar(500),
	ma_nhan nchar(3),
	constraint fk_phim_nhan foreign key(ma_nhan) references nhan(ma_nhan),
	)

alter table phim add tinh_trang nvarchar(20)

select * from phim order by tenphim
delete phim where ma_phim = 'P416891790'
UPDATE PHIM SET tinh_trang = N'Sắp chiếu' where ma_phim = 'P945072217'
select * from phim where tenphim like 'SP%'
---------------------------------------------------------------------------------------------------

create table phim_dinhdang(
	ma_phim nchar(10),
	ma_dinh_dang nchar(2),
	primary key(ma_phim,ma_dinh_dang),
	constraint fk_phimdinhdang_phim foreign key(ma_phim) references phim(ma_phim),
	constraint fk_phimdinhdang_dinhdang foreign key(ma_dinh_dang) references dinhdang(ma_dinh_dang)
	)

select * from phim_dinhdang order by ma_dinh_dang
drop table phim_dinhdang
select a.ma_phim, b.tenphim, a.ma_dinh_dang from phim_dinhdang a, phim b where a.ma_phim = b.ma_phim order by a.ma_dinh_dang
---------------------------------------------------------------------------------------------------

create table KTG(
	ma_ktg nchar(10) primary key,
	ngay_chieu date,
	gio_chieu nchar(5)
	)

select * from KTG order by ngay_chieu, gio_chieu
delete from KTG where ma_ktg = 'KTG3507647'
---------------------------------------------------------------------------------------------------

create table lichchieu(
	ma_ktg nchar(10),
	ma_phim nchar(10),
	ma_rap nchar(5),
	primary key(ma_ktg,ma_phim,ma_rap),

	constraint fk_lichchieu_KTG foreign key(ma_ktg) references KTG(ma_ktg),
	constraint fk_lichchieu_phim foreign key(ma_phim) references phim(ma_phim),
	constraint fk_lichchieu_rap foreign key(ma_rap) references rap(ma_rap)
	)

select a.ma_ktg, a.ma_phim, a.ma_rap from lichchieu a, rap b, dinhdang c, phim d where a.ma_rap = b.ma_rap and b.ma_dinh_dang = c.ma_dinh_dang and a.ma_phim = d.ma_phim
select b.ma_phim, b.tenphim, b.thoi_luong, d.ma_dinh_dang, e.ngay_chieu, e.gio_chieu, f.ma_rap, b.ma_nhan from lichchieu a, phim b, phim_dinhdang c, dinhdang d, ktg e, rap f 
                     where a.ma_ktg = e.ma_ktg and a.ma_phim = b.ma_phim and a.ma_rap = f.ma_rap and b.ma_phim = c.ma_phim and d.ma_dinh_dang = c.ma_dinh_dang and d.ma_dinh_dang = f.ma_dinh_dang order by e.ngay_chieu, e.gio_chieu
---------------------------------------------------------------------------------------------------

create table trangthai(
	ma_trang_thai nchar(3) primary key,
	mo_ta nvarchar(30)
	)

insert into trangthai values ('GDC',N'Ghế đang chọn')
insert into trangthai values ('GDB',N'Ghế đã bán')
insert into trangthai values ('CTC',N'Ghế có thể chọn')
insert into trangthai values ('KTC',N'Ghế không thể chọn')

---------------------------------------------------------------------------------------------------

create table loaighe(
	ma_loai nchar(3) primary key,
	ten_loai nvarchar(10)
	)

insert into loaighe values ('BT','Ghế thường')
insert into loaighe values ('VIP','Ghế VIP')
insert into loaighe values ('SW','Ghế đôi')

---------------------------------------------------------------------------------------------------

create table ghe(
	ma_ghe nchar(3),
	ma_loai nchar(3),
	ma_trang_thai nchar(3),
	ma_rap nchar(5),
	primary key(ma_ghe, ma_rap),

	constraint fk_ghe_loaighe foreign key(ma_loai) references loaighe(ma_loai),
	constraint fk_ghe_trangthai foreign key(ma_trang_thai) references trangthai(ma_trang_thai),
	constraint fk_ghe_rap foreign key(ma_rap) references rap(ma_rap)
	)

insert into ghe values('A1','BT','CTC','RAP01')
insert into ghe values('A2','BT','CTC','RAP01')
insert into ghe values('A3','BT','CTC','RAP01')
insert into ghe values('A4','BT','CTC','RAP01')
insert into ghe values('A5','BT','CTC','RAP01')
insert into ghe values('A6','BT','CTC','RAP01')
insert into ghe values('A7','BT','CTC','RAP01')
insert into ghe values('A8','BT','CTC','RAP01')
insert into ghe values('A9','BT','CTC','RAP01')
insert into ghe values('A10','BT','CTC','RAP01')
insert into ghe values('B1','BT','CTC','RAP01')
insert into ghe values('B2','BT','CTC','RAP01')
insert into ghe values('B3','BT','CTC','RAP01')
insert into ghe values('B4','BT','CTC','RAP01')
insert into ghe values('B5','BT','CTC','RAP01')
insert into ghe values('B6','BT','CTC','RAP01')
insert into ghe values('B7','BT','CTC','RAP01')
insert into ghe values('B8','BT','CTC','RAP01')
insert into ghe values('B9','BT','CTC','RAP01')
insert into ghe values('B10','BT','CTC','RAP01')
insert into ghe values('C1','BT','CTC','RAP01')
insert into ghe values('C2','BT','CTC','RAP01')
insert into ghe values('C3','BT','CTC','RAP01')
insert into ghe values('C4','BT','CTC','RAP01')
insert into ghe values('C5','BT','CTC','RAP01')
insert into ghe values('C6','BT','CTC','RAP01')
insert into ghe values('C7','BT','CTC','RAP01')
insert into ghe values('C8','BT','CTC','RAP01')
insert into ghe values('C9','BT','CTC','RAP01')
insert into ghe values('C10','BT','CTC','RAP01')
insert into ghe values('D1','BT','CTC','RAP01')
insert into ghe values('D2','BT','CTC','RAP01')
insert into ghe values('D3','BT','CTC','RAP01')
insert into ghe values('D4','BT','CTC','RAP01')
insert into ghe values('D5','BT','CTC','RAP01')
insert into ghe values('D6','BT','CTC','RAP01')
insert into ghe values('D7','BT','CTC','RAP01')
insert into ghe values('D8','BT','CTC','RAP01')
insert into ghe values('D9','BT','CTC','RAP01')
insert into ghe values('D10','BT','CTC','RAP01')
insert into ghe values('E1','VIP','CTC','RAP01')
insert into ghe values('E2','VIP','CTC','RAP01')
insert into ghe values('E3','VIP','CTC','RAP01')
insert into ghe values('E4','VIP','CTC','RAP01')
insert into ghe values('E5','VIP','CTC','RAP01')
insert into ghe values('E6','VIP','CTC','RAP01')
insert into ghe values('E7','VIP','CTC','RAP01')
insert into ghe values('E8','VIP','CTC','RAP01')
insert into ghe values('E9','VIP','CTC','RAP01')
insert into ghe values('E10','VIP','CTC','RAP01')
insert into ghe values('F1','VIP','CTC','RAP01')
insert into ghe values('F2','VIP','CTC','RAP01')
insert into ghe values('F3','VIP','CTC','RAP01')
insert into ghe values('F4','VIP','CTC','RAP01')
insert into ghe values('F5','VIP','CTC','RAP01')
insert into ghe values('F6','VIP','CTC','RAP01')
insert into ghe values('F7','VIP','CTC','RAP01')
insert into ghe values('F8','VIP','CTC','RAP01')
insert into ghe values('F9','VIP','CTC','RAP01')
insert into ghe values('F10','VIP','CTC','RAP01')
insert into ghe values('G1','VIP','CTC','RAP01')
insert into ghe values('G2','VIP','CTC','RAP01')
insert into ghe values('G3','VIP','CTC','RAP01')
insert into ghe values('G4','VIP','CTC','RAP01')
insert into ghe values('G5','VIP','CTC','RAP01')
insert into ghe values('G6','VIP','CTC','RAP01')
insert into ghe values('G7','VIP','CTC','RAP01')
insert into ghe values('G8','VIP','CTC','RAP01')
insert into ghe values('G9','VIP','CTC','RAP01')
insert into ghe values('G10','VIP','CTC','RAP01')
insert into ghe values('H1','VIP','CTC','RAP01')
insert into ghe values('H2','VIP','CTC','RAP01')
insert into ghe values('H3','VIP','CTC','RAP01')
insert into ghe values('H4','VIP','CTC','RAP01')
insert into ghe values('H5','VIP','CTC','RAP01')
insert into ghe values('H6','VIP','CTC','RAP01')
insert into ghe values('H7','VIP','CTC','RAP01')
insert into ghe values('H8','VIP','CTC','RAP01')
insert into ghe values('H9','VIP','CTC','RAP01')
insert into ghe values('H10','VIP','CTC','RAP01')
insert into ghe values('J1','VIP','CTC','RAP01')
insert into ghe values('J2','VIP','CTC','RAP01')
insert into ghe values('J3','VIP','CTC','RAP01')
insert into ghe values('J4','VIP','CTC','RAP01')
insert into ghe values('J5','VIP','CTC','RAP01')
insert into ghe values('J6','VIP','CTC','RAP01')
insert into ghe values('J7','VIP','CTC','RAP01')
insert into ghe values('J8','VIP','CTC','RAP01')
insert into ghe values('J9','VIP','CTC','RAP01')
insert into ghe values('J10','VIP','CTC','RAP01')
insert into ghe values('K1','SW','CTC','RAP01')
insert into ghe values('K2','SW','CTC','RAP01')
insert into ghe values('K3','SW','CTC','RAP01')
insert into ghe values('K4','SW','CTC','RAP01')
insert into ghe values('K5','SW','CTC','RAP01')
insert into ghe values('K6','SW','CTC','RAP01')
insert into ghe values('K7','SW','CTC','RAP01')
insert into ghe values('K8','SW','CTC','RAP01')
insert into ghe values('K9','SW','CTC','RAP01')
insert into ghe values('K10','SW','CTC','RAP01')


insert into ghe values('A1','BT','CTC','RAP03')
insert into ghe values('A2','BT','CTC','RAP03')
insert into ghe values('A3','BT','CTC','RAP03')
insert into ghe values('A4','BT','CTC','RAP03')
insert into ghe values('A5','BT','CTC','RAP03')
insert into ghe values('A6','BT','CTC','RAP03')
insert into ghe values('A7','BT','CTC','RAP03')
insert into ghe values('A8','BT','CTC','RAP03')
insert into ghe values('A9','BT','CTC','RAP03')
insert into ghe values('A10','BT','CTC','RAP03')
insert into ghe values('B1','BT','CTC','RAP03')
insert into ghe values('B2','BT','CTC','RAP03')
insert into ghe values('B3','BT','CTC','RAP03')
insert into ghe values('B4','BT','CTC','RAP03')
insert into ghe values('B5','BT','CTC','RAP03')
insert into ghe values('B6','BT','CTC','RAP03')
insert into ghe values('B7','BT','CTC','RAP03')
insert into ghe values('B8','BT','CTC','RAP03')
insert into ghe values('B9','BT','CTC','RAP03')
insert into ghe values('B10','BT','CTC','RAP03')
insert into ghe values('C1','BT','CTC','RAP03')
insert into ghe values('C2','BT','CTC','RAP03')
insert into ghe values('C3','BT','CTC','RAP03')
insert into ghe values('C4','BT','CTC','RAP03')
insert into ghe values('C5','BT','CTC','RAP03')
insert into ghe values('C6','BT','CTC','RAP03')
insert into ghe values('C7','BT','CTC','RAP03')
insert into ghe values('C8','BT','CTC','RAP03')
insert into ghe values('C9','BT','CTC','RAP03')
insert into ghe values('C10','BT','CTC','RAP03')
insert into ghe values('D1','BT','CTC','RAP03')
insert into ghe values('D2','BT','CTC','RAP03')
insert into ghe values('D3','BT','CTC','RAP03')
insert into ghe values('D4','BT','CTC','RAP03')
insert into ghe values('D5','BT','CTC','RAP03')
insert into ghe values('D6','BT','CTC','RAP03')
insert into ghe values('D7','BT','CTC','RAP03')
insert into ghe values('D8','BT','CTC','RAP03')
insert into ghe values('D9','BT','CTC','RAP03')
insert into ghe values('D10','BT','CTC','RAP03')
insert into ghe values('E1','VIP','CTC','RAP03')
insert into ghe values('E2','VIP','CTC','RAP03')
insert into ghe values('E3','VIP','CTC','RAP03')
insert into ghe values('E4','VIP','CTC','RAP03')
insert into ghe values('E5','VIP','CTC','RAP03')
insert into ghe values('E6','VIP','CTC','RAP03')
insert into ghe values('E7','VIP','CTC','RAP03')
insert into ghe values('E8','VIP','CTC','RAP03')
insert into ghe values('E9','VIP','CTC','RAP03')
insert into ghe values('E10','VIP','CTC','RAP03')
insert into ghe values('F1','VIP','CTC','RAP03')
insert into ghe values('F2','VIP','CTC','RAP03')
insert into ghe values('F3','VIP','CTC','RAP03')
insert into ghe values('F4','VIP','CTC','RAP03')
insert into ghe values('F5','VIP','CTC','RAP03')
insert into ghe values('F6','VIP','CTC','RAP03')
insert into ghe values('F7','VIP','CTC','RAP03')
insert into ghe values('F8','VIP','CTC','RAP03')
insert into ghe values('F9','VIP','CTC','RAP03')
insert into ghe values('F10','VIP','CTC','RAP03')
insert into ghe values('G1','VIP','CTC','RAP03')
insert into ghe values('G2','VIP','CTC','RAP03')
insert into ghe values('G3','VIP','CTC','RAP03')
insert into ghe values('G4','VIP','CTC','RAP03')
insert into ghe values('G5','VIP','CTC','RAP03')
insert into ghe values('G6','VIP','CTC','RAP03')
insert into ghe values('G7','VIP','CTC','RAP03')
insert into ghe values('G8','VIP','CTC','RAP03')
insert into ghe values('G9','VIP','CTC','RAP03')
insert into ghe values('G10','VIP','CTC','RAP03')
insert into ghe values('H1','VIP','CTC','RAP03')
insert into ghe values('H2','VIP','CTC','RAP03')
insert into ghe values('H3','VIP','CTC','RAP03')
insert into ghe values('H4','VIP','CTC','RAP03')
insert into ghe values('H5','VIP','CTC','RAP03')
insert into ghe values('H6','VIP','CTC','RAP03')
insert into ghe values('H7','VIP','CTC','RAP03')
insert into ghe values('H8','VIP','CTC','RAP03')
insert into ghe values('H9','VIP','CTC','RAP03')
insert into ghe values('H10','VIP','CTC','RAP03')
insert into ghe values('J1','VIP','CTC','RAP03')
insert into ghe values('J2','VIP','CTC','RAP03')
insert into ghe values('J3','VIP','CTC','RAP03')
insert into ghe values('J4','VIP','CTC','RAP03')
insert into ghe values('J5','VIP','CTC','RAP03')
insert into ghe values('J6','VIP','CTC','RAP03')
insert into ghe values('J7','VIP','CTC','RAP03')
insert into ghe values('J8','VIP','CTC','RAP03')
insert into ghe values('J9','VIP','CTC','RAP03')
insert into ghe values('J10','VIP','CTC','RAP03')
insert into ghe values('K1','SW','CTC','RAP03')
insert into ghe values('K2','SW','CTC','RAP03')
insert into ghe values('K3','SW','CTC','RAP03')
insert into ghe values('K4','SW','CTC','RAP03')
insert into ghe values('K5','SW','CTC','RAP03')
insert into ghe values('K6','SW','CTC','RAP03')
insert into ghe values('K7','SW','CTC','RAP03')
insert into ghe values('K8','SW','CTC','RAP03')
insert into ghe values('K9','SW','CTC','RAP03')
insert into ghe values('K10','SW','CTC','RAP03')


insert into ghe values('A1','BT','CTC','RAP05')
insert into ghe values('A2','BT','CTC','RAP05')
insert into ghe values('A3','BT','CTC','RAP05')
insert into ghe values('A4','BT','CTC','RAP05')
insert into ghe values('A5','BT','CTC','RAP05')
insert into ghe values('A6','BT','CTC','RAP05')
insert into ghe values('A7','BT','CTC','RAP05')
insert into ghe values('A8','BT','CTC','RAP05')
insert into ghe values('A9','BT','CTC','RAP05')
insert into ghe values('A10','BT','CTC','RAP05')
insert into ghe values('B1','BT','CTC','RAP05')
insert into ghe values('B2','BT','CTC','RAP05')
insert into ghe values('B3','BT','CTC','RAP05')
insert into ghe values('B4','BT','CTC','RAP05')
insert into ghe values('B5','BT','CTC','RAP05')
insert into ghe values('B6','BT','CTC','RAP05')
insert into ghe values('B7','BT','CTC','RAP05')
insert into ghe values('B8','BT','CTC','RAP05')
insert into ghe values('B9','BT','CTC','RAP05')
insert into ghe values('B10','BT','CTC','RAP05')
insert into ghe values('C1','BT','CTC','RAP05')
insert into ghe values('C2','BT','CTC','RAP05')
insert into ghe values('C3','BT','CTC','RAP05')
insert into ghe values('C4','BT','CTC','RAP05')
insert into ghe values('C5','BT','CTC','RAP05')
insert into ghe values('C6','BT','CTC','RAP05')
insert into ghe values('C7','BT','CTC','RAP05')
insert into ghe values('C8','BT','CTC','RAP05')
insert into ghe values('C9','BT','CTC','RAP05')
insert into ghe values('C10','BT','CTC','RAP05')
insert into ghe values('D1','BT','CTC','RAP05')
insert into ghe values('D2','BT','CTC','RAP05')
insert into ghe values('D3','BT','CTC','RAP05')
insert into ghe values('D4','BT','CTC','RAP05')
insert into ghe values('D5','BT','CTC','RAP05')
insert into ghe values('D6','BT','CTC','RAP05')
insert into ghe values('D7','BT','CTC','RAP05')
insert into ghe values('D8','BT','CTC','RAP05')
insert into ghe values('D9','BT','CTC','RAP05')
insert into ghe values('D10','BT','CTC','RAP05')
insert into ghe values('E1','VIP','CTC','RAP05')
insert into ghe values('E2','VIP','CTC','RAP05')
insert into ghe values('E3','VIP','CTC','RAP05')
insert into ghe values('E4','VIP','CTC','RAP05')
insert into ghe values('E5','VIP','CTC','RAP05')
insert into ghe values('E6','VIP','CTC','RAP05')
insert into ghe values('E7','VIP','CTC','RAP05')
insert into ghe values('E8','VIP','CTC','RAP05')
insert into ghe values('E9','VIP','CTC','RAP05')
insert into ghe values('E10','VIP','CTC','RAP05')
insert into ghe values('F1','VIP','CTC','RAP05')
insert into ghe values('F2','VIP','CTC','RAP05')
insert into ghe values('F3','VIP','CTC','RAP05')
insert into ghe values('F4','VIP','CTC','RAP05')
insert into ghe values('F5','VIP','CTC','RAP05')
insert into ghe values('F6','VIP','CTC','RAP05')
insert into ghe values('F7','VIP','CTC','RAP05')
insert into ghe values('F8','VIP','CTC','RAP05')
insert into ghe values('F9','VIP','CTC','RAP05')
insert into ghe values('F10','VIP','CTC','RAP05')
insert into ghe values('G1','VIP','CTC','RAP05')
insert into ghe values('G2','VIP','CTC','RAP05')
insert into ghe values('G3','VIP','CTC','RAP05')
insert into ghe values('G4','VIP','CTC','RAP05')
insert into ghe values('G5','VIP','CTC','RAP05')
insert into ghe values('G6','VIP','CTC','RAP05')
insert into ghe values('G7','VIP','CTC','RAP05')
insert into ghe values('G8','VIP','CTC','RAP05')
insert into ghe values('G9','VIP','CTC','RAP05')
insert into ghe values('G10','VIP','CTC','RAP05')
insert into ghe values('H1','VIP','CTC','RAP05')
insert into ghe values('H2','VIP','CTC','RAP05')
insert into ghe values('H3','VIP','CTC','RAP05')
insert into ghe values('H4','VIP','CTC','RAP05')
insert into ghe values('H5','VIP','CTC','RAP05')
insert into ghe values('H6','VIP','CTC','RAP05')
insert into ghe values('H7','VIP','CTC','RAP05')
insert into ghe values('H8','VIP','CTC','RAP05')
insert into ghe values('H9','VIP','CTC','RAP05')
insert into ghe values('H10','VIP','CTC','RAP05')
insert into ghe values('J1','VIP','CTC','RAP05')
insert into ghe values('J2','VIP','CTC','RAP05')
insert into ghe values('J3','VIP','CTC','RAP05')
insert into ghe values('J4','VIP','CTC','RAP05')
insert into ghe values('J5','VIP','CTC','RAP05')
insert into ghe values('J6','VIP','CTC','RAP05')
insert into ghe values('J7','VIP','CTC','RAP05')
insert into ghe values('J8','VIP','CTC','RAP05')
insert into ghe values('J9','VIP','CTC','RAP05')
insert into ghe values('J10','VIP','CTC','RAP05')
insert into ghe values('K1','SW','CTC','RAP05')
insert into ghe values('K2','SW','CTC','RAP05')
insert into ghe values('K3','SW','CTC','RAP05')
insert into ghe values('K4','SW','CTC','RAP05')
insert into ghe values('K5','SW','CTC','RAP05')
insert into ghe values('K6','SW','CTC','RAP05')
insert into ghe values('K7','SW','CTC','RAP05')
insert into ghe values('K8','SW','CTC','RAP05')
insert into ghe values('K9','SW','CTC','RAP05')
insert into ghe values('K10','SW','CTC','RAP05')


insert into ghe values('A1','BT','CTC','RAP02')
insert into ghe values('A2','BT','CTC','RAP02')
insert into ghe values('A3','BT','CTC','RAP02')
insert into ghe values('A4','BT','CTC','RAP02')
insert into ghe values('A5','BT','CTC','RAP02')
insert into ghe values('A6','BT','CTC','RAP02')
insert into ghe values('A7','BT','CTC','RAP02')
insert into ghe values('A8','BT','CTC','RAP02')
insert into ghe values('A9','BT','CTC','RAP02')
insert into ghe values('A10','BT','CTC','RAP02')
insert into ghe values('B1','BT','CTC','RAP02')
insert into ghe values('B2','BT','CTC','RAP02')
insert into ghe values('B3','BT','CTC','RAP02')
insert into ghe values('B4','BT','CTC','RAP02')
insert into ghe values('B5','BT','CTC','RAP02')
insert into ghe values('B6','BT','CTC','RAP02')
insert into ghe values('B7','BT','CTC','RAP02')
insert into ghe values('B8','BT','CTC','RAP02')
insert into ghe values('B9','BT','CTC','RAP02')
insert into ghe values('B10','BT','CTC','RAP02')
insert into ghe values('C1','BT','CTC','RAP02')
insert into ghe values('C2','BT','CTC','RAP02')
insert into ghe values('C3','BT','CTC','RAP02')
insert into ghe values('C4','BT','CTC','RAP02')
insert into ghe values('C5','BT','CTC','RAP02')
insert into ghe values('C6','BT','CTC','RAP02')
insert into ghe values('C7','BT','CTC','RAP02')
insert into ghe values('C8','BT','CTC','RAP02')
insert into ghe values('C9','BT','CTC','RAP02')
insert into ghe values('C10','BT','CTC','RAP02')
insert into ghe values('D1','BT','CTC','RAP02')
insert into ghe values('D2','BT','CTC','RAP02')
insert into ghe values('D3','BT','CTC','RAP02')
insert into ghe values('D4','BT','CTC','RAP02')
insert into ghe values('D5','BT','CTC','RAP02')
insert into ghe values('D6','BT','CTC','RAP02')
insert into ghe values('D7','BT','CTC','RAP02')
insert into ghe values('D8','BT','CTC','RAP02')
insert into ghe values('D9','BT','CTC','RAP02')
insert into ghe values('D10','BT','CTC','RAP02')
insert into ghe values('E1','VIP','CTC','RAP02')
insert into ghe values('E2','VIP','CTC','RAP02')
insert into ghe values('E3','VIP','CTC','RAP02')
insert into ghe values('E4','VIP','CTC','RAP02')
insert into ghe values('E5','VIP','CTC','RAP02')
insert into ghe values('E6','VIP','CTC','RAP02')
insert into ghe values('E7','VIP','CTC','RAP02')
insert into ghe values('E8','VIP','CTC','RAP02')
insert into ghe values('E9','VIP','CTC','RAP02')
insert into ghe values('E10','VIP','CTC','RAP02')
insert into ghe values('F1','VIP','CTC','RAP02')
insert into ghe values('F2','VIP','CTC','RAP02')
insert into ghe values('F3','VIP','CTC','RAP02')
insert into ghe values('F4','VIP','CTC','RAP02')
insert into ghe values('F5','VIP','CTC','RAP02')
insert into ghe values('F6','VIP','CTC','RAP02')
insert into ghe values('F7','VIP','CTC','RAP02')
insert into ghe values('F8','VIP','CTC','RAP02')
insert into ghe values('F9','VIP','CTC','RAP02')
insert into ghe values('F10','VIP','CTC','RAP02')
insert into ghe values('G1','VIP','CTC','RAP02')
insert into ghe values('G2','VIP','CTC','RAP02')
insert into ghe values('G3','VIP','CTC','RAP02')
insert into ghe values('G4','VIP','CTC','RAP02')
insert into ghe values('G5','VIP','CTC','RAP02')
insert into ghe values('G6','VIP','CTC','RAP02')
insert into ghe values('G7','VIP','CTC','RAP02')
insert into ghe values('G8','VIP','CTC','RAP02')
insert into ghe values('G9','VIP','CTC','RAP02')
insert into ghe values('G10','VIP','CTC','RAP02')
insert into ghe values('H1','VIP','CTC','RAP02')
insert into ghe values('H2','VIP','CTC','RAP02')
insert into ghe values('H3','VIP','CTC','RAP02')
insert into ghe values('H4','VIP','CTC','RAP02')
insert into ghe values('H5','VIP','CTC','RAP02')
insert into ghe values('H6','VIP','CTC','RAP02')
insert into ghe values('H7','VIP','CTC','RAP02')
insert into ghe values('H8','VIP','CTC','RAP02')
insert into ghe values('H9','VIP','CTC','RAP02')
insert into ghe values('H10','VIP','CTC','RAP02')
insert into ghe values('J1','VIP','CTC','RAP02')
insert into ghe values('J2','VIP','CTC','RAP02')
insert into ghe values('J3','VIP','CTC','RAP02')
insert into ghe values('J4','VIP','CTC','RAP02')
insert into ghe values('J5','VIP','CTC','RAP02')
insert into ghe values('J6','VIP','CTC','RAP02')
insert into ghe values('J7','VIP','CTC','RAP02')
insert into ghe values('J8','VIP','CTC','RAP02')
insert into ghe values('J9','VIP','CTC','RAP02')
insert into ghe values('J10','VIP','CTC','RAP02')
insert into ghe values('K1','SW','CTC','RAP02')
insert into ghe values('K2','SW','CTC','RAP02')
insert into ghe values('K3','SW','CTC','RAP02')
insert into ghe values('K4','SW','CTC','RAP02')
insert into ghe values('K5','SW','CTC','RAP02')
insert into ghe values('K6','SW','CTC','RAP02')
insert into ghe values('K7','SW','CTC','RAP02')
insert into ghe values('K8','SW','CTC','RAP02')
insert into ghe values('K9','SW','CTC','RAP02')
insert into ghe values('K10','SW','CTC','RAP02')


insert into ghe values('A1','BT','CTC','RAP04')
insert into ghe values('A2','BT','CTC','RAP04')
insert into ghe values('A3','BT','CTC','RAP04')
insert into ghe values('A4','BT','CTC','RAP04')
insert into ghe values('A5','BT','CTC','RAP04')
insert into ghe values('A6','BT','CTC','RAP04')
insert into ghe values('A7','BT','CTC','RAP04')
insert into ghe values('A8','BT','CTC','RAP04')
insert into ghe values('A9','BT','CTC','RAP04')
insert into ghe values('A10','BT','CTC','RAP04')
insert into ghe values('B1','BT','CTC','RAP04')
insert into ghe values('B2','BT','CTC','RAP04')
insert into ghe values('B3','BT','CTC','RAP04')
insert into ghe values('B4','BT','CTC','RAP04')
insert into ghe values('B5','BT','CTC','RAP04')
insert into ghe values('B6','BT','CTC','RAP04')
insert into ghe values('B7','BT','CTC','RAP04')
insert into ghe values('B8','BT','CTC','RAP04')
insert into ghe values('B9','BT','CTC','RAP04')
insert into ghe values('B10','BT','CTC','RAP04')
insert into ghe values('C1','BT','CTC','RAP04')
insert into ghe values('C2','BT','CTC','RAP04')
insert into ghe values('C3','BT','CTC','RAP04')
insert into ghe values('C4','BT','CTC','RAP04')
insert into ghe values('C5','BT','CTC','RAP04')
insert into ghe values('C6','BT','CTC','RAP04')
insert into ghe values('C7','BT','CTC','RAP04')
insert into ghe values('C8','BT','CTC','RAP04')
insert into ghe values('C9','BT','CTC','RAP04')
insert into ghe values('C10','BT','CTC','RAP04')
insert into ghe values('D1','BT','CTC','RAP04')
insert into ghe values('D2','BT','CTC','RAP04')
insert into ghe values('D3','BT','CTC','RAP04')
insert into ghe values('D4','BT','CTC','RAP04')
insert into ghe values('D5','BT','CTC','RAP04')
insert into ghe values('D6','BT','CTC','RAP04')
insert into ghe values('D7','BT','CTC','RAP04')
insert into ghe values('D8','BT','CTC','RAP04')
insert into ghe values('D9','BT','CTC','RAP04')
insert into ghe values('D10','BT','CTC','RAP04')
insert into ghe values('E1','VIP','CTC','RAP04')
insert into ghe values('E2','VIP','CTC','RAP04')
insert into ghe values('E3','VIP','CTC','RAP04')
insert into ghe values('E4','VIP','CTC','RAP04')
insert into ghe values('E5','VIP','CTC','RAP04')
insert into ghe values('E6','VIP','CTC','RAP04')
insert into ghe values('E7','VIP','CTC','RAP04')
insert into ghe values('E8','VIP','CTC','RAP04')
insert into ghe values('E9','VIP','CTC','RAP04')
insert into ghe values('E10','VIP','CTC','RAP04')
insert into ghe values('F1','VIP','CTC','RAP04')
insert into ghe values('F2','VIP','CTC','RAP04')
insert into ghe values('F3','VIP','CTC','RAP04')
insert into ghe values('F4','VIP','CTC','RAP04')
insert into ghe values('F5','VIP','CTC','RAP04')
insert into ghe values('F6','VIP','CTC','RAP04')
insert into ghe values('F7','VIP','CTC','RAP04')
insert into ghe values('F8','VIP','CTC','RAP04')
insert into ghe values('F9','VIP','CTC','RAP04')
insert into ghe values('F10','VIP','CTC','RAP04')
insert into ghe values('G1','VIP','CTC','RAP04')
insert into ghe values('G2','VIP','CTC','RAP04')
insert into ghe values('G3','VIP','CTC','RAP04')
insert into ghe values('G4','VIP','CTC','RAP04')
insert into ghe values('G5','VIP','CTC','RAP04')
insert into ghe values('G6','VIP','CTC','RAP04')
insert into ghe values('G7','VIP','CTC','RAP04')
insert into ghe values('G8','VIP','CTC','RAP04')
insert into ghe values('G9','VIP','CTC','RAP04')
insert into ghe values('G10','VIP','CTC','RAP04')
insert into ghe values('H1','VIP','CTC','RAP04')
insert into ghe values('H2','VIP','CTC','RAP04')
insert into ghe values('H3','VIP','CTC','RAP04')
insert into ghe values('H4','VIP','CTC','RAP04')
insert into ghe values('H5','VIP','CTC','RAP04')
insert into ghe values('H6','VIP','CTC','RAP04')
insert into ghe values('H7','VIP','CTC','RAP04')
insert into ghe values('H8','VIP','CTC','RAP04')
insert into ghe values('H9','VIP','CTC','RAP04')
insert into ghe values('H10','VIP','CTC','RAP04')
insert into ghe values('J1','VIP','CTC','RAP04')
insert into ghe values('J2','VIP','CTC','RAP04')
insert into ghe values('J3','VIP','CTC','RAP04')
insert into ghe values('J4','VIP','CTC','RAP04')
insert into ghe values('J5','VIP','CTC','RAP04')
insert into ghe values('J6','VIP','CTC','RAP04')
insert into ghe values('J7','VIP','CTC','RAP04')
insert into ghe values('J8','VIP','CTC','RAP04')
insert into ghe values('J9','VIP','CTC','RAP04')
insert into ghe values('J10','VIP','CTC','RAP04')
insert into ghe values('K1','SW','CTC','RAP04')
insert into ghe values('K2','SW','CTC','RAP04')
insert into ghe values('K3','SW','CTC','RAP04')
insert into ghe values('K4','SW','CTC','RAP04')
insert into ghe values('K5','SW','CTC','RAP04')
insert into ghe values('K6','SW','CTC','RAP04')
insert into ghe values('K7','SW','CTC','RAP04')
insert into ghe values('K8','SW','CTC','RAP04')
insert into ghe values('K9','SW','CTC','RAP04')
insert into ghe values('K10','SW','CTC','RAP04')


insert into ghe values('A1','BT','CTC','RAP06')
insert into ghe values('A2','BT','CTC','RAP06')
insert into ghe values('A3','BT','CTC','RAP06')
insert into ghe values('A4','BT','CTC','RAP06')
insert into ghe values('A5','BT','CTC','RAP06')
insert into ghe values('A6','BT','CTC','RAP06')
insert into ghe values('A7','BT','CTC','RAP06')
insert into ghe values('A8','BT','CTC','RAP06')
insert into ghe values('A9','BT','CTC','RAP06')
insert into ghe values('A10','BT','CTC','RAP06')
insert into ghe values('B1','BT','CTC','RAP06')
insert into ghe values('B2','BT','CTC','RAP06')
insert into ghe values('B3','BT','CTC','RAP06')
insert into ghe values('B4','BT','CTC','RAP06')
insert into ghe values('B5','BT','CTC','RAP06')
insert into ghe values('B6','BT','CTC','RAP06')
insert into ghe values('B7','BT','CTC','RAP06')
insert into ghe values('B8','BT','CTC','RAP06')
insert into ghe values('B9','BT','CTC','RAP06')
insert into ghe values('B10','BT','CTC','RAP06')
insert into ghe values('C1','BT','CTC','RAP06')
insert into ghe values('C2','BT','CTC','RAP06')
insert into ghe values('C3','BT','CTC','RAP06')
insert into ghe values('C4','BT','CTC','RAP06')
insert into ghe values('C5','BT','CTC','RAP06')
insert into ghe values('C6','BT','CTC','RAP06')
insert into ghe values('C7','BT','CTC','RAP06')
insert into ghe values('C8','BT','CTC','RAP06')
insert into ghe values('C9','BT','CTC','RAP06')
insert into ghe values('C10','BT','CTC','RAP06')
insert into ghe values('D1','BT','CTC','RAP06')
insert into ghe values('D2','BT','CTC','RAP06')
insert into ghe values('D3','BT','CTC','RAP06')
insert into ghe values('D4','BT','CTC','RAP06')
insert into ghe values('D5','BT','CTC','RAP06')
insert into ghe values('D6','BT','CTC','RAP06')
insert into ghe values('D7','BT','CTC','RAP06')
insert into ghe values('D8','BT','CTC','RAP06')
insert into ghe values('D9','BT','CTC','RAP06')
insert into ghe values('D10','BT','CTC','RAP06')

select * from ghe order by ma_rap
---------------------------------------------------------------------------------------------------

create table gia(
	ma_gia nchar(20) primary key,
	dongia int
	)

insert into gia values ('BT2DTHUONG',95000)
insert into gia values ('BT2DCUOITUAN',115000)
insert into gia values ('VIP2DTHUONG',100000)
insert into gia values ('VIP2DCUOITUAN',120000)
insert into gia values ('SW2DTHUONG',205000)
insert into gia values ('SW2DCUOITUAN',255000)
insert into gia values ('BT3DTHUONG',125000)
insert into gia values ('BT3DCUOITUAN',145000)
insert into gia values ('VIP3DTHUONG',130000)
insert into gia values ('VIP3DCUOITUAN',150000)
insert into gia values ('SW3DTHUONG',235000)
insert into gia values ('SW3DCUOITUAN',285000)
insert into gia values ('4DTHUONG',175000)
insert into gia values ('4DCUOITUAN',235000)

select * from gia
---------------------------------------------------------------------------------------------------

create table ve(
	ma_ve nchar(12) primary key,
	ma_phim nchar(10),
	ma_rap nchar(5),
	ma_ghe nchar(3),
	ma_ktg nchar(10),
	ma_gia nchar(20),

	constraint fk_ve_phim foreign key(ma_phim) references phim(ma_phim),
	constraint fk_ve_rap foreign key(ma_rap) references rap(ma_rap),
	constraint fk_ve_ghe foreign key(ma_ghe,ma_rap) references ghe(ma_ghe, ma_rap),
	constraint fk_ve_ktg foreign key(ma_ktg) references KTG(ma_ktg),
	constraint fk_ve_gia foreign key(ma_gia) references gia(ma_gia)
	)

insert into ve values ('VE8079770510','P128660986','RAP01','D1', 'KTG9983180','BT2DTHUONG')
insert into ve values ('VE0947245640','P128660986','RAP01','D5', 'KTG9983180','BT2DTHUONG')
insert into ve values ('VE0913697630','P128660986','RAP01','D6', 'KTG9983180','BT2DTHUONG')
insert into ve values ('VE8110165524','P128660986','RAP01','D9', 'KTG9983180','BT2DTHUONG')
insert into ve values ('VE0255602055','P128660986','RAP01','D10', 'KTG9983180','BT2DTHUONG')
insert into ve values ('VE0240778165','P128660986','RAP01','F1', 'KTG9983180','VIP2DTHUONG')
insert into ve values ('VE4726212687','P128660986','RAP01','F5', 'KTG9983180','VIP2DTHUONG')
insert into ve values ('VE0378418056','P128660986','RAP01','F6', 'KTG9983180','VIP2DTHUONG')
insert into ve values ('VE3345585604','P128660986','RAP01','F9', 'KTG9983180','VIP2DTHUONG')
insert into ve values ('VE6294860006','P128660986','RAP01','F10', 'KTG9983180','VIP2DTHUONG')

insert into ve values ('VE3314690200','P937941127','RAP03','E4', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE9016297481','P937941127','RAP03','E5', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE0138717214','P937941127','RAP03','E6', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE1982333384','P937941127','RAP03','E7', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE2903783453','P937941127','RAP03','E9', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE8645276319','P937941127','RAP03','G1', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE7941588202','P937941127','RAP03','G5', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE3853506313','P937941127','RAP03','G6', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE3344532589','P937941127','RAP03','G9', 'KTG1512419','VIP2DTHUONG')
insert into ve values ('VE0083547812','P937941127','RAP03','G10', 'KTG1512419','VIP2DTHUONG')

insert into ve values ('VE4836921577','P410961982','RAP05','E4', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE6035460741','P410961982','RAP05','E5', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE2042972784','P410961982','RAP05','E6', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE8935742982','P410961982','RAP05','E7', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE5889480467','P410961982','RAP05','E9', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE4968902146','P410961982','RAP05','G1', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE3228359021','P410961982','RAP05','G5', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE6854071640','P410961982','RAP05','G6', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE8182252354','P410961982','RAP05','G9', 'KTG0104555','VIP2DTHUONG')
insert into ve values ('VE9708583026','P410961982','RAP05','G10', 'KTG0104555','VIP2DTHUONG')

insert into ve values ('VE8515290994','P262839359','RAP02','D1', 'KTG9218289','BT3DTHUONG')
insert into ve values ('VE0314080768','P262839359','RAP02','D5', 'KTG9218289','BT3DTHUONG')
insert into ve values ('VE6402112004','P262839359','RAP02','D6', 'KTG9218289','BT3DTHUONG')
insert into ve values ('VE8112291622','P262839359','RAP02','D9', 'KTG9218289','BT3DTHUONG')
insert into ve values ('VE2789292236','P262839359','RAP02','D10', 'KTG9218289','BT3DTHUONG')
insert into ve values ('VE3051026925','P262839359','RAP02','H1', 'KTG9218289','VIP3DTHUONG')
insert into ve values ('VE0870593796','P262839359','RAP02','H5', 'KTG9218289','VIP3DTHUONG')
insert into ve values ('VE7750139375','P262839359','RAP02','H6', 'KTG9218289','VIP3DTHUONG')
insert into ve values ('VE3645735594','P262839359','RAP02','H9', 'KTG9218289','VIP3DTHUONG')
insert into ve values ('VE4201721435','P262839359','RAP02','H10', 'KTG9218289','VIP3DTHUONG')

insert into ve values ('VE2512120666','P166367488','RAP04','J7', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE3811722505','P166367488','RAP04','J8', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE7736432896','P166367488','RAP04','J9', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE7037676820','P166367488','RAP04','J1', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE3770126998','P166367488','RAP04','J2', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE0816355506','P166367488','RAP04','J5', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE7419926249','P166367488','RAP04','J6', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE4645600658','P166367488','RAP04','G5', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE3560741675','P166367488','RAP04','G6', 'KTG5019970','VIP3DTHUONG')
insert into ve values ('VE2555691656','P166367488','RAP04','G7', 'KTG5019970','VIP3DTHUONG')

insert into ve values ('VE9041731917','P831360440','RAP06','B4', 'KTG1184432','4DTHUONG')
insert into ve values ('VE0961823351','P831360440','RAP06','B5', 'KTG1184432','4DTHUONG')
insert into ve values ('VE1117959874','P831360440','RAP06','B6', 'KTG1184432','4DTHUONG')
insert into ve values ('VE3340487310','P831360440','RAP06','C2', 'KTG1184432','4DTHUONG')
insert into ve values ('VE5337436703','P831360440','RAP06','C2', 'KTG1184432','4DTHUONG')

select * from ve order by ma_rap
---------------------------------------------------------------------------------------------------

create table ds_ve_dat(
	ma_ve nchar(12) primary key,
	ma_thanh_vien nchar(10),
	ma_nhan_vien nchar(8),
	constraint fk_ds_ve foreign key(ma_ve) references ve(ma_ve),
	constraint fk_ds_thanhvien foreign key(ma_thanh_vien) references thanhvien(ma_thanh_vien),
	constraint fk_ds_nhanvien foreign key(ma_nhan_vien) references nhanvien(ma_nhan_vien)
	)