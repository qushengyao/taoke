package com.pinyougou.page.service;

public interface ItemPageService {

    Boolean genItemHtml(Long goodsId);

    void deleteHtml(Long[] goodsIds);
}
