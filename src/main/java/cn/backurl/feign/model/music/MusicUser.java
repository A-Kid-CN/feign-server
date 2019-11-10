package cn.backurl.feign.model.music;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 网易云音乐用户信息表
 * </p>
 *
 * @author akid
 * @since 2019-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MusicUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 性别（0：位置，1：男，2：女）
     */
    private Boolean gender;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 网易云id
     */
    private Long wyyId;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 粉丝数
     */
    private Integer followeds;

    /**
     * 关注数
     */
    private Integer follows;

    /**
     * 签名
     */
    private String signature;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 用户主页背景图地址
     */
    private String backgroundUrl;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
