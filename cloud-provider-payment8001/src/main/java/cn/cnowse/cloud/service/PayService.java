package cn.cnowse.cloud.service;

import cn.cnowse.cloud.entities.Pay;

import java.util.List;

/**
 * @author Jeong Geol 2024-3-3
 */
public interface PayService {

    int add(Pay pay);

    int delete(Integer id);

    int update(Pay pay);

    Pay getById(Integer id);

    List<Pay> list();

}
