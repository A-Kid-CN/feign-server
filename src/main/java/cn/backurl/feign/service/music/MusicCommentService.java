package cn.backurl.feign.service.music;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 网易云音乐评论数据表 服务类
 * </p>
 *
 * @author akid
 * @since 2019-08-13
 */
@FeignClient(value = "music-server")
public interface MusicCommentService  {


    /**
     * <br>
     * 功能描述: 获取歌曲的评论列表
     * </br>
     *
     * @param songId   歌曲id
     * @param pageNo   页码
     * @param pageSize 页大小
     * @param keyword  关键字
     * @return:CommentResult
     * @since: 1.0.0
     * @Author:akid
     * @Date: 2019/8/13 20:45
     */
    @GetMapping(value = "/music/comment/page")
    Object pageComments(@RequestParam(value = "songId")Long songId,
                        @RequestParam(value = "pageNo")Integer pageNo,
                        @RequestParam(value = "pageSize")Integer pageSize,
                        @RequestParam(value = "keyword")String keyword);

}
