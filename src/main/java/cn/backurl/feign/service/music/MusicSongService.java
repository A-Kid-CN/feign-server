package cn.backurl.feign.service.music;


import cn.backurl.feign.model.music.MusicSong;
import cn.backurl.feign.service.IService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 * 歌曲详情表 服务类
 * </p>
 *
 * @author akid
 * @since 2019-08-23
 */
@FeignClient(value = "music-server")
public interface MusicSongService extends IService<MusicSong> {

    /**
     * <p>
     * 功能描述: 从网易云获取歌曲详情
     * </p>
     *
     * @param songId
     * @Author: akid
     * @Date: 2019-08-23 00:41
     * @Return: MusicSong
     */
    MusicSong getSongDetailFromWYY(long songId);
}
