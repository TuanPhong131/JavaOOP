package OnThi.src.QuanLiCanBo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLiCanBoImpl implements QuanLiCanBo {

    List<CongNhan> listCongNhan = new ArrayList<>();
    List<KySu> listKySu = new ArrayList<>();
    List<NhanVien> listNhanVien = new ArrayList<>();

    @Override
    public void Them() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Them cong nhan");
        System.out.println("2: Them ki su");
        System.out.println("3: Them nhan vien");
        System.out.println("Nhap lua chon");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1: {
                System.out.println("Nhap thong tin cong nhan");
                CongNhan congNhan = new CongNhan();
                congNhan.Nhap();
                listCongNhan.add(congNhan);
                break;
            }
            case 2: {
                System.out.println("Nhap thong tin ki su");
                KySu kySu = new KySu();
                kySu.Nhap();
                listKySu.add(kySu);
                break;
            }
            case 3: {
                System.out.println("Nhap thong tin nhan vien");
                NhanVien nhanVien = new NhanVien();
                nhanVien.Nhap();
                listNhanVien.add(nhanVien);
                break;
            }
        }
    }

    @Override
    public void SapXepTheoTuoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Sap xep danh sach cong nhan");
        System.out.println("2: Sap xep danh sach ki su");
        System.out.println("3: Sap xep danh sach nhan vien");
        System.out.println("Nhap lua chon");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1: {
                listCongNhan.sort(new sortByAge());
                break;
            }
            case 2: {
                listKySu.sort(new sortByAge());
                break;
            }
            case 3: {
                listNhanVien.sort(new sortByAge());
                break;
            }
        }
    }

    @Override
    public void TimKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Tim kiem danh sach cong nhan");
        System.out.println("2: Tim kiem danh sach ki su");
        System.out.println("3: Tim kiem danh sach nhan vien");
        System.out.println("Nhap lua chon");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1: {
                System.out.println("Nhap ten cong nhan can tim:");
                String nameCongNhan = scanner.nextLine();
                for (int i = 0; i < listCongNhan.size(); i++) {
                    if (nameCongNhan.equals(listCongNhan.get(i).getName())) {
                        System.out.println("Thong tin cong nhan can tim la:");
                        listCongNhan.get(i).Xuat();
                    } else {
                        System.out.println("Khong ton tai");
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Nhap ten ki su can tim:");
                String nameKiSu = scanner.nextLine();
                for (int i = 0; i < listKySu.size(); i++) {
                    if (nameKiSu.equals(listKySu.get(i).getName())) {
                        System.out.println("Thong tin ki su can tim la:");
                        listKySu.get(i).Xuat();
                    } else {
                        System.out.println("Khong ton tai");
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Nhap ten nhan vien can tim:");
                String nameNhanVien = scanner.nextLine();
                for (int i = 0; i < listNhanVien.size(); i++) {
                    if (nameNhanVien.equals(listNhanVien.get(i).getName())) {
                        System.out.println("Thong tin nhan vien can tim la:");
                        listNhanVien.get(i).Xuat();
                    } else {
                        System.out.println("Khong ton tai");
                    }
                }
                break;
            }
        }
    }

    @Override
    public void Xuat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Danh sach cong nhan");
        System.out.println("2: Danh sach ki su");
        System.out.println("3: Danh sach nhan vien");
        System.out.println("Nhap lua chon");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1: {
                for (int i = 0; i < listCongNhan.size(); i++) {
                    System.out.println("Thong tin cong nhan " + (i + 1));
                    listCongNhan.get(i).Xuat();
                }
                break;
            }
            case 2: {
                for (int i = 0; i < listKySu.size(); i++) {
                    System.out.println("Thong tin ki su " + (i + 1));
                    listKySu.get(i).Xuat();
                }
                break;
            }
            case 3: {
                for (int i = 0; i < listNhanVien.size(); i++) {
                    System.out.println("Thong tin nhan vien " + (i + 1));
                    listNhanVien.get(i).Xuat();
                }
                break;
            }
        }
    }

    public static class sortByAge implements Comparator<CanBo> {
        @Override
        public int compare(CanBo s1, CanBo s2) {
            return s1.getAge() - s2.getAge();
        }
    }
}
