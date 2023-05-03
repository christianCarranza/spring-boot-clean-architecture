package com.carranza.ca.moneytransfers.application.port.out;

import com.carranza.ca.moneytransfers.domain.Account;

public interface UpdateAccountPort {

    void update(Account account);
}
