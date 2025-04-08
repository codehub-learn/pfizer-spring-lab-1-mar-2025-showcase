package com.acme.eshop;

import com.acme.eshop.domain.*;
import com.acme.eshop.service.CategoryService;
import com.acme.eshop.service.CustomerService;
import com.acme.eshop.service.OrderService;
import com.acme.eshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class MainRunner implements CommandLineRunner {

    private final CustomerService customerService;
    private final ProductService productService;
    private final CategoryService categoryService;
    private final OrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        //log.error("MainRunner started");
        customerService.greet();
        //Customer customer = new Customer();
        //Customer customer = new Customer("2@gmail.com", "John", "Daniil", 36, "Athens 13th Av.", CustomerCategory.BUSINESS);
        Customer builtCustomer = Customer.builder().email("2@gmail.com").firstname("John").lastname("Daniil").age(36).address("Athens 13th Av.").customerCategory(CustomerCategory.BUSINESS).build();
        log.info("CustomerService before save: {}", builtCustomer);
        // comment out if hibernate ddl-auto is validate
        customerService.save(builtCustomer);
        log.info("CustomerService after save: {}", builtCustomer);
        // uncomment if hibernate ddl-auto is validate
        //List<Customer> allFoundCustomers = customerService.findAll();
        //log.info("All found customers: {}", allFoundCustomers);

        // SIMPLE ENTITY ASSOCIATION
        Category builtCategory = Category.builder().description("Vegetables").build();
        categoryService.save(builtCategory);
        Product builtProduct = Product.builder().name("Tomato").price(BigDecimal.TEN).serial("AE21512521").category(builtCategory).build();
        productService.save(builtProduct);
        log.info("Product after save: {}", builtProduct);

        // ENTITY IS CHILD OF ANOTHER ENTITY
        Order builtOrder = Order.builder().customer(builtCustomer).cost(BigDecimal.TEN).paymentMethod(PaymentMethod.CASH).submitDate(new Date()).orderItems(new HashSet<>()).build();
        builtOrder.getOrderItems().add(OrderItem.builder().product(builtProduct).quantity(2).price(BigDecimal.TEN).order(builtOrder).build());
        orderService.save(builtOrder);
    }
}
