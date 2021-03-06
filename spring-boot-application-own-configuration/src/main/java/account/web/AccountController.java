/*
 * Copyright (C) 2015 DISID CORPORATION S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see `<http://www.gnu.org/licenses/>`.
 */
package account.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import account.domain.Account;
import account.service.AccountService;

@Controller
class AccountController {

    @Autowired
    protected AccountService accountService;

    /**
     * See section `Run Tests` at README.adoc to learn how to test.
     */
    @RequestMapping(value="/accounts", produces="application/json")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Account getAccount(@RequestParam String number) {
        Account account = accountService.findOne(number);
        return account;
    }
}
