package com.gmd.contraller;

import com.gmd.pojo.Tbuser;
import com.gmd.service.TbuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tbuser")
public class TbuserController {
    @Autowired
    private TbuserService tbuserService;
    @RequestMapping("/selectByPrimaryKey")
    public Tbuser selectByPrimaryKey (@RequestParam("id") int id) {
        return tbuserService.selectByPrimaryKey(id);
    }

}
