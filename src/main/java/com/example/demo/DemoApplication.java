package com.example.demo;

import com.example.demo.service.RoleService;
import com.example.demo.service.StudentService;
import com.example.demo.view.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }
    @Autowired
    private RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời b nhập tên role muốn tìm: ");
        String name = scanner.nextLine();
        //roleService.insertRole(name);
        roleService.findByName(name);
        // Menu hiển thị cho người dùng chọn
        // Insert, delete, update tìm kiếm user theo phone
        // Hiển thị menu -> chọn -> CRUD
        // Hoàn thiện các entity dựa trên mối quan hệ của chúng
        // Viết các hàm insert khóa học và thời gian học
    }
}
