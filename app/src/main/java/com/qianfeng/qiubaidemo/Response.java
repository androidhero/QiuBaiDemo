package com.qianfeng.qiubaidemo;

/**
 * Created by gaoChao
 * Date 15-12-30
 */
public class Response {

    /**
     * format : word
     * image : null
     * published_at : 1451420401
     * tag :
     * user : {"avatar_updated_at":1405268635,"last_visited_at":1405268409,"created_at":1405268409,"state":"active","email":"","last_device":"android_3.0.3","role":"n","login":"旧时光ヾ。。","id":17861003,"icon":"20140714002354.jpg"}
     * image_size : null
     * id : 114471390
     * votes : {"down":-173,"up":7057}
     * created_at : 1451392701
     * content : 床上铺着电热毯 ，突然想起小时候，家里穷，取暖都是拿私人诊所用过的输液的瓶子，装满热水。那时候抱着热水瓶睡觉就很满足了，致那些逝去的童年回忆
     * state : publish
     * comments_count : 205
     * allow_comment : true
     * share_count : 31
     * type : hot
     */

    private String format;
    private Object image;
    private int published_at;
    private String tag;
    /**
     * avatar_updated_at : 1405268635
     * last_visited_at : 1405268409
     * created_at : 1405268409
     * state : active
     * email :
     * last_device : android_3.0.3
     * role : n
     * login : 旧时光ヾ。。
     * id : 17861003
     * icon : 20140714002354.jpg
     */

    private UserEntity user;
    private Object image_size;
    private int id;
    private int created_at;
    private String content;
    private String state;
    private String type;

    public void setFormat(String format) {
        this.format = format;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public void setPublished_at(int published_at) {
        this.published_at = published_at;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setImage_size(Object image_size) {
        this.image_size = image_size;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public Object getImage() {
        return image;
    }

    public int getPublished_at() {
        return published_at;
    }

    public String getTag() {
        return tag;
    }

    public UserEntity getUser() {
        return user;
    }

    public Object getImage_size() {
        return image_size;
    }

    public int getId() {
        return id;
    }

    public int getCreated_at() {
        return created_at;
    }

    public String getContent() {
        return content;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }

    public static class UserEntity {
        private int avatar_updated_at;
        private int last_visited_at;
        private int created_at;
        private String state;
        private String email;
        private String last_device;
        private String role;
        private String login;
        private int id;
        private String icon;

        public void setAvatar_updated_at(int avatar_updated_at) {
            this.avatar_updated_at = avatar_updated_at;
        }

        public void setLast_visited_at(int last_visited_at) {
            this.last_visited_at = last_visited_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setLast_device(String last_device) {
            this.last_device = last_device;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getAvatar_updated_at() {
            return avatar_updated_at;
        }

        public int getLast_visited_at() {
            return last_visited_at;
        }

        public int getCreated_at() {
            return created_at;
        }

        public String getState() {
            return state;
        }

        public String getEmail() {
            return email;
        }

        public String getLast_device() {
            return last_device;
        }

        public String getRole() {
            return role;
        }

        public String getLogin() {
            return login;
        }

        public int getId() {
            return id;
        }

        public String getIcon() {
            return icon;
        }
    }
}
