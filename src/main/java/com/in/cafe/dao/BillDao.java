package com.in.cafe.dao;

import com.in.cafe.POJO.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDao extends JpaRepository<Bill, Integer> {

}
