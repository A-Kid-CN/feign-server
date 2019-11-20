package cn.backurl.feign.service.music.impl;

import cn.backurl.feign.common.result.AjaxResult;
import cn.backurl.feign.common.result.ResultCode;
import cn.backurl.feign.service.music.MusicCommentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author: akid
 * @create: 2019-11-20 17:31
 **/
@Service
public class MusicCommentServiceImpl implements MusicCommentService {
    @Override
    public Object pageComments(Long songId, Integer pageNo, Integer pageSize, String keyword) {
        return AjaxResult.failure(ResultCode.FAILURE, "断路器起作用ing...");
    }
}
