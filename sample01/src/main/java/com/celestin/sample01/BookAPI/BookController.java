package com.celestin.sample01.BookAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public List<Book> retrieveBookData() {
        return Arrays.asList(
                new Book(1,"oliver Twist","benjamin","fiction",255.7,5,true),
                new Book(2,"alavudheen","mark","fiction",550,55,true),
                new Book(3,"aadujeevitham","benyaman","normal",300,33,true),
                new Book(4,"wings of fire","APJ","non-fiction",550,0,false),
                new Book(5,"life","antony","fiction",227,8,true)
        );
    }

}
