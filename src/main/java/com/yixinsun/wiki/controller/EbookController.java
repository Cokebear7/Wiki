package com.yixinsun.wiki.controller;

import com.yixinsun.wiki.domain.Ebook;
import com.yixinsun.wiki.req.EbookReq;
import com.yixinsun.wiki.resp.CommonResp;
import com.yixinsun.wiki.resp.EbookResp;
import com.yixinsun.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}

