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

    /*
    *功能描述
    *@autho helang
    *@data
    *@param  用户名和密码判断
    *@return true
     */
    @RequestMapping("/selectByIdOrUsernameAndPwd")
    public Tbuser selectByIdOrUsernameAndPwd (Tbuser tbuser) {
        tbuser = tbuserService.selectByIdOrUsernameAndPwd(tbuser);
    return tbuser;
    }
}
