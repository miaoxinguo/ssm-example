package io.github.miaoxinguo.sbs.repository;

import io.github.miaoxinguo.sbs.entity.Account;
import io.github.miaoxinguo.sbs.qo.PageableQueryObject;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends PageableRepository<Account, Integer, PageableQueryObject>{
}