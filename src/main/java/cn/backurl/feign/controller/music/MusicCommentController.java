package cn.backurl.feign.controller.music;

import cn.backurl.feign.common.result.AjaxResult;
import cn.backurl.feign.common.result.ResultCode;
import cn.backurl.feign.service.music.MusicCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 音乐评论控制层
 * </p>
 *
 * @author: akid
 * @create: 2019-08-19 23:54
 **/
@RestController
@RequestMapping("/music/comment")
@Slf4j
public class MusicCommentController {

    @Autowired
    private MusicCommentService musicCommentService;

    @GetMapping("/page")
    public Object pageComments(Long songId, Integer pageNo, Integer pageSize, String keyword) {
        if (null == songId || null == pageNo || null == pageSize) {
            return AjaxResult.failure(ResultCode.ParamException);
        }
        Object obj = musicCommentService.pageComments(songId, pageNo, pageSize, keyword);
        return obj;
    }
}
