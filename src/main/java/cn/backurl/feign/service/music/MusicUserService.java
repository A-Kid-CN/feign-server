package cn.backurl.feign.service.music;


import cn.backurl.feign.model.music.MusicUser;
import cn.backurl.feign.service.IService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author akid
 * @since 2019-08-13
 */
@FeignClient(value = "music-server")
public interface MusicUserService extends IService<MusicUser> {

}
