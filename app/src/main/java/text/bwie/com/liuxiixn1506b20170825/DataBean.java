package text.bwie.com.liuxiixn1506b20170825;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.util.List;

/**
 * 类描述：解析json类，创建数据库
 * 姓名 ：刘希鑫
 */
@Table(name = "yuekao")
public class DataBean {

        /**
         * abstract : 灰姑娘嫁给霸道总裁，豪门太太给她定制豪华衣服，让她当场看懵了
         * action_list : [{"action":1,"desc":"","extra":{}},{"action":3,"desc":"","extra":{}},{"action":7,"desc":"","extra":{}},{"action":9,"desc":"","extra":{}}]
         * aggr_type : 1
         * allow_download : false
         * article_sub_type : 0
         * article_type : 0
         * article_url : http://toutiao.com/group/6457348283319714318/
         * ban_comment : 0
         * behot_time : 1503647585
         * bury_count : 0
         * cell_flag : 11
         * cell_layout_style : 1
         * cell_type : 0
         * comment_count : 2
         * cursor : 1503647585000
         * digg_count : 9
         * display_url : http://toutiao.com/group/6457348283319714318/
         * filter_words : [{"id":"8:0","is_selected":false,"name":"看过了"},{"id":"9:1","is_selected":false,"name":"内容太水"},{"id":"5:975513973","is_selected":false,"name":"拉黑作者:大军爱动漫"},{"id":"6:16098","is_selected":false,"name":"不想看:豪门"},{"id":"6:16991","is_selected":false,"name":"不想看:灰姑娘"}]
         * forward_info : {"forward_count":0}
         * group_flags : 32832
         * group_id : 6457348283319714318
         * has_m3u8_video : false
         * has_mp4_video : 0
         * has_video : true
         * hot : 0
         * ignore_web_transform : 1
         * is_subject : false
         * item_id : 6457348283319714318
         * item_version : 0
         * keywords : 灰姑娘,豪门
         * large_image_list : [{"height":326,"uri":"video1609/374100012f81f35c8aaf","url":"http://p1.pstatp.com/video1609/374100012f81f35c8aaf","url_list":[{"url":"http://p1.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb3.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb9.pstatp.com/video1609/374100012f81f35c8aaf"}],"width":580}]
         * level : 0
         * like_count : 9
         * log_pb : {"impr_id":"2017082515530501000805821213326F"}
         * media_info : {"avatar_url":"http://p1.pstatp.com/large/150d0011669fdb89463c","follow":false,"is_star_user":false,"media_id":1558488950785025,"name":"大军爱动漫","recommend_reason":"","recommend_type":0,"user_id":52715449621,"user_verified":false,"verified_content":""}
         * media_name : 大军爱动漫
         * middle_image : {"height":357,"uri":"list/374100012f81f35c8aaf","url":"http://p1.pstatp.com/list/374100012f81f35c8aaf","url_list":[{"url":"http://p1.pstatp.com/list/374100012f81f35c8aaf"},{"url":"http://pb3.pstatp.com/list/374100012f81f35c8aaf"},{"url":"http://pb9.pstatp.com/list/374100012f81f35c8aaf"}],"width":636}
         * publish_time : 1503468557
         * read_count : 2187
         * repin_count : 4
         * rid : 2017082515530501000805821213326F
         * share_count : 16
         * share_url : http://toutiao.com/a6457348283319714318/?iid=3642583580&app=news_article
         * show_portrait : false
         * show_portrait_article : false
         * source : 大军爱动漫
         * source_icon_style : 1
         * source_open_url : sslocal://profile?refer=video&uid=52715449621
         * tag : news
         * tag_id : 6457348283319714318
         * tip : 0
         * title : 灰姑娘嫁给霸道总裁，豪门太太给她定制豪华衣服，让她当场看懵了
         * ugc_recommend : {"activity":"","reason":""}
         * url : http://toutiao.com/group/6457348283319714318/
         * user_info : {"avatar_url":"http://p1.pstatp.com/thumb/150d0011669fdb89463c","description":"为动漫爱好者带来不一样的动漫，只要你想看就没有你看不到的动漫","follow":false,"follower_count":0,"name":"大军爱动漫","user_id":52715449621,"user_verified":false}
         * user_repin : 0
         * user_verified : 0
         * verified_content :
         * video_detail_info : {"detail_video_large_image":{"height":326,"uri":"video1609/374100012f81f35c8aaf","url":"http://p1.pstatp.com/video1609/374100012f81f35c8aaf","url_list":[{"url":"http://p1.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb3.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb9.pstatp.com/video1609/374100012f81f35c8aaf"}],"width":580},"direct_play":1,"group_flags":32832,"show_pgc_subscribe":1,"video_id":"1e58d1571c134dcfa232fc744f6296e4","video_preloading_flag":0,"video_type":0,"video_watch_count":8516,"video_watching_count":0}
         * video_duration : 56
         * video_id : 1e58d1571c134dcfa232fc744f6296e4
         * video_style : 0
         * gallary_image_count : 4
         * has_image : true
         * image_list : [{"height":164,"uri":"list/32220004cd0ed21ee846","url":"http://p3.pstatp.com/list/32220004cd0ed21ee846","url_list":[{"url":"http://p3.pstatp.com/list/32220004cd0ed21ee846"},{"url":"http://pb9.pstatp.com/list/32220004cd0ed21ee846"},{"url":"http://pb1.pstatp.com/list/32220004cd0ed21ee846"}],"width":292},{"height":360,"uri":"list/37c80004f11f79c838d5","url":"http://p9.pstatp.com/list/37c80004f11f79c838d5","url_list":[{"url":"http://p9.pstatp.com/list/37c80004f11f79c838d5"},{"url":"http://pb1.pstatp.com/list/37c80004f11f79c838d5"},{"url":"http://pb3.pstatp.com/list/37c80004f11f79c838d5"}],"width":640},{"height":318,"uri":"list/37c70001d5e22ad10203","url":"http://p1.pstatp.com/list/37c70001d5e22ad10203","url_list":[{"url":"http://p1.pstatp.com/list/37c70001d5e22ad10203"},{"url":"http://pb3.pstatp.com/list/37c70001d5e22ad10203"},{"url":"http://pb9.pstatp.com/list/37c70001d5e22ad10203"}],"width":566}]
         * preload_web : 1
         * source_avatar : http://p1.pstatp.com/thumb/7290007f6a8032a9696
         * video_proportion_article : 1
         * video_source : ugc_video
         * article_alt_url : http://toutiao.com/group/article/6457365090558542350/
         */


        private String abstractX;
        private int aggr_type;
        private boolean allow_download;
        private int article_sub_type;
        private int article_type;
        private String article_url;
        private int ban_comment;
        private int behot_time;
        private int bury_count;
        private int cell_flag;
        private int cell_layout_style;
        private int cell_type;
        private int comment_count;
        private long cursor;
        private int digg_count;
        private String display_url;
        private ForwardInfoBean forward_info;
        private int group_flags;
        private long group_id;
        private boolean has_m3u8_video;
        private int has_mp4_video;
        private boolean has_video;
        private int hot;
        private int ignore_web_transform;
        private boolean is_subject;
        private long item_id;
        private int item_version;
        private String keywords;
        private int level;
        private int like_count;
        private LogPbBean log_pb;
        private MediaInfoBean media_info;
        private String media_name;
        private MiddleImageBean middle_image;
        private int publish_time;
        private int read_count;
        private int repin_count;
        private String rid;
        private int share_count;
        private String share_url;
        private boolean show_portrait;
        private boolean show_portrait_article;
        private String source;
        private int source_icon_style;
        private String source_open_url;
        private String tag;
        @Column(name = "tag_id",isId = true)
        private long tag_id;
        private int tip;
        @Column(name = "title")
        private String title;
        private UgcRecommendBean ugc_recommend;
        @Column(name = "url")
        private String url;
        private UserInfoBean user_info;

        private int user_repin;

        private int user_verified;

        private String verified_content;
        private VideoDetailInfoBean video_detail_info;
        private int video_duration;
        private String video_id;
        private int video_style;
        private int gallary_image_count;
        private boolean has_image;
        private int preload_web;
        private String source_avatar;
        private int video_proportion_article;
        private String video_source;
        private String article_alt_url;
        private List<ActionListBean> action_list;
        private List<FilterWordsBean> filter_words;
        private List<LargeImageListBean> large_image_list;
        private List<ImageListBean> image_list;

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public int getAggr_type() {
            return aggr_type;
        }

        public void setAggr_type(int aggr_type) {
            this.aggr_type = aggr_type;
        }

        public boolean isAllow_download() {
            return allow_download;
        }

        public void setAllow_download(boolean allow_download) {
            this.allow_download = allow_download;
        }

        public int getArticle_sub_type() {
            return article_sub_type;
        }

        public void setArticle_sub_type(int article_sub_type) {
            this.article_sub_type = article_sub_type;
        }

        public int getArticle_type() {
            return article_type;
        }

        public void setArticle_type(int article_type) {
            this.article_type = article_type;
        }

        public String getArticle_url() {
            return article_url;
        }

        public void setArticle_url(String article_url) {
            this.article_url = article_url;
        }

        public int getBan_comment() {
            return ban_comment;
        }

        public void setBan_comment(int ban_comment) {
            this.ban_comment = ban_comment;
        }

        public int getBehot_time() {
            return behot_time;
        }

        public void setBehot_time(int behot_time) {
            this.behot_time = behot_time;
        }

        public int getBury_count() {
            return bury_count;
        }

        public void setBury_count(int bury_count) {
            this.bury_count = bury_count;
        }

        public int getCell_flag() {
            return cell_flag;
        }

        public void setCell_flag(int cell_flag) {
            this.cell_flag = cell_flag;
        }

        public int getCell_layout_style() {
            return cell_layout_style;
        }

        public void setCell_layout_style(int cell_layout_style) {
            this.cell_layout_style = cell_layout_style;
        }

        public int getCell_type() {
            return cell_type;
        }

        public void setCell_type(int cell_type) {
            this.cell_type = cell_type;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public long getCursor() {
            return cursor;
        }

        public void setCursor(long cursor) {
            this.cursor = cursor;
        }

        public int getDigg_count() {
            return digg_count;
        }

        public void setDigg_count(int digg_count) {
            this.digg_count = digg_count;
        }

        public String getDisplay_url() {
            return display_url;
        }

        public void setDisplay_url(String display_url) {
            this.display_url = display_url;
        }

        public ForwardInfoBean getForward_info() {
            return forward_info;
        }

        public void setForward_info(ForwardInfoBean forward_info) {
            this.forward_info = forward_info;
        }

        public int getGroup_flags() {
            return group_flags;
        }

        public void setGroup_flags(int group_flags) {
            this.group_flags = group_flags;
        }

        public long getGroup_id() {
            return group_id;
        }

        public void setGroup_id(long group_id) {
            this.group_id = group_id;
        }

        public boolean isHas_m3u8_video() {
            return has_m3u8_video;
        }

        public void setHas_m3u8_video(boolean has_m3u8_video) {
            this.has_m3u8_video = has_m3u8_video;
        }

        public int getHas_mp4_video() {
            return has_mp4_video;
        }

        public void setHas_mp4_video(int has_mp4_video) {
            this.has_mp4_video = has_mp4_video;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public int getHot() {
            return hot;
        }

        public void setHot(int hot) {
            this.hot = hot;
        }

        public int getIgnore_web_transform() {
            return ignore_web_transform;
        }

        public void setIgnore_web_transform(int ignore_web_transform) {
            this.ignore_web_transform = ignore_web_transform;
        }

        public boolean isIs_subject() {
            return is_subject;
        }

        public void setIs_subject(boolean is_subject) {
            this.is_subject = is_subject;
        }

        public long getItem_id() {
            return item_id;
        }

        public void setItem_id(long item_id) {
            this.item_id = item_id;
        }

        public int getItem_version() {
            return item_version;
        }

        public void setItem_version(int item_version) {
            this.item_version = item_version;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getLike_count() {
            return like_count;
        }

        public void setLike_count(int like_count) {
            this.like_count = like_count;
        }

        public LogPbBean getLog_pb() {
            return log_pb;
        }

        public void setLog_pb(LogPbBean log_pb) {
            this.log_pb = log_pb;
        }

        public MediaInfoBean getMedia_info() {
            return media_info;
        }

        public void setMedia_info(MediaInfoBean media_info) {
            this.media_info = media_info;
        }

        public String getMedia_name() {
            return media_name;
        }

        public void setMedia_name(String media_name) {
            this.media_name = media_name;
        }

        public MiddleImageBean getMiddle_image() {
            return middle_image;
        }

        public void setMiddle_image(MiddleImageBean middle_image) {
            this.middle_image = middle_image;
        }

        public int getPublish_time() {
            return publish_time;
        }

        public void setPublish_time(int publish_time) {
            this.publish_time = publish_time;
        }

        public int getRead_count() {
            return read_count;
        }

        public void setRead_count(int read_count) {
            this.read_count = read_count;
        }

        public int getRepin_count() {
            return repin_count;
        }

        public void setRepin_count(int repin_count) {
            this.repin_count = repin_count;
        }

        public String getRid() {
            return rid;
        }

        public void setRid(String rid) {
            this.rid = rid;
        }

        public int getShare_count() {
            return share_count;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public boolean isShow_portrait() {
            return show_portrait;
        }

        public void setShow_portrait(boolean show_portrait) {
            this.show_portrait = show_portrait;
        }

        public boolean isShow_portrait_article() {
            return show_portrait_article;
        }

        public void setShow_portrait_article(boolean show_portrait_article) {
            this.show_portrait_article = show_portrait_article;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getSource_icon_style() {
            return source_icon_style;
        }

        public void setSource_icon_style(int source_icon_style) {
            this.source_icon_style = source_icon_style;
        }

        public String getSource_open_url() {
            return source_open_url;
        }

        public void setSource_open_url(String source_open_url) {
            this.source_open_url = source_open_url;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public long getTag_id() {
            return tag_id;
        }

        public void setTag_id(long tag_id) {
            this.tag_id = tag_id;
        }

        public int getTip() {
            return tip;
        }

        public void setTip(int tip) {
            this.tip = tip;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public UgcRecommendBean getUgc_recommend() {
            return ugc_recommend;
        }

        public void setUgc_recommend(UgcRecommendBean ugc_recommend) {
            this.ugc_recommend = ugc_recommend;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public UserInfoBean getUser_info() {
            return user_info;
        }

        public void setUser_info(UserInfoBean user_info) {
            this.user_info = user_info;
        }

        public int getUser_repin() {
            return user_repin;
        }

        public void setUser_repin(int user_repin) {
            this.user_repin = user_repin;
        }

        public int getUser_verified() {
            return user_verified;
        }

        public void setUser_verified(int user_verified) {
            this.user_verified = user_verified;
        }

        public String getVerified_content() {
            return verified_content;
        }

        public void setVerified_content(String verified_content) {
            this.verified_content = verified_content;
        }

        public VideoDetailInfoBean getVideo_detail_info() {
            return video_detail_info;
        }

        public void setVideo_detail_info(VideoDetailInfoBean video_detail_info) {
            this.video_detail_info = video_detail_info;
        }

        public int getVideo_duration() {
            return video_duration;
        }

        public void setVideo_duration(int video_duration) {
            this.video_duration = video_duration;
        }

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public int getVideo_style() {
            return video_style;
        }

        public void setVideo_style(int video_style) {
            this.video_style = video_style;
        }

        public int getGallary_image_count() {
            return gallary_image_count;
        }

        public void setGallary_image_count(int gallary_image_count) {
            this.gallary_image_count = gallary_image_count;
        }

        public boolean isHas_image() {
            return has_image;
        }

        public void setHas_image(boolean has_image) {
            this.has_image = has_image;
        }

        public int getPreload_web() {
            return preload_web;
        }

        public void setPreload_web(int preload_web) {
            this.preload_web = preload_web;
        }

        public String getSource_avatar() {
            return source_avatar;
        }

        public void setSource_avatar(String source_avatar) {
            this.source_avatar = source_avatar;
        }

        public int getVideo_proportion_article() {
            return video_proportion_article;
        }

        public void setVideo_proportion_article(int video_proportion_article) {
            this.video_proportion_article = video_proportion_article;
        }

        public String getVideo_source() {
            return video_source;
        }

        public void setVideo_source(String video_source) {
            this.video_source = video_source;
        }

        public String getArticle_alt_url() {
            return article_alt_url;
        }

        public void setArticle_alt_url(String article_alt_url) {
            this.article_alt_url = article_alt_url;
        }

        public List<ActionListBean> getAction_list() {
            return action_list;
        }

        public void setAction_list(List<ActionListBean> action_list) {
            this.action_list = action_list;
        }

        public List<FilterWordsBean> getFilter_words() {
            return filter_words;
        }

        public void setFilter_words(List<FilterWordsBean> filter_words) {
            this.filter_words = filter_words;
        }

        public List<LargeImageListBean> getLarge_image_list() {
            return large_image_list;
        }

        public void setLarge_image_list(List<LargeImageListBean> large_image_list) {
            this.large_image_list = large_image_list;
        }

        public List<ImageListBean> getImage_list() {
            return image_list;
        }

        public void setImage_list(List<ImageListBean> image_list) {
            this.image_list = image_list;
        }

        public static class ForwardInfoBean {
            /**
             * forward_count : 0
             */

            private int forward_count;

            public int getForward_count() {
                return forward_count;
            }

            public void setForward_count(int forward_count) {
                this.forward_count = forward_count;
            }
        }

        public static class LogPbBean {
            /**
             * impr_id : 2017082515530501000805821213326F
             */

            private String impr_id;

            public String getImpr_id() {
                return impr_id;
            }

            public void setImpr_id(String impr_id) {
                this.impr_id = impr_id;
            }
        }

        public static class MediaInfoBean {
            /**
             * avatar_url : http://p1.pstatp.com/large/150d0011669fdb89463c
             * follow : false
             * is_star_user : false
             * media_id : 1558488950785025
             * name : 大军爱动漫
             * recommend_reason :
             * recommend_type : 0
             * user_id : 52715449621
             * user_verified : false
             * verified_content :
             */

            private String avatar_url;
            private boolean follow;
            private boolean is_star_user;
            private long media_id;
            private String name;
            private String recommend_reason;
            private int recommend_type;
            private long user_id;
            private boolean user_verified;
            private String verified_content;

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public boolean isIs_star_user() {
                return is_star_user;
            }

            public void setIs_star_user(boolean is_star_user) {
                this.is_star_user = is_star_user;
            }

            public long getMedia_id() {
                return media_id;
            }

            public void setMedia_id(long media_id) {
                this.media_id = media_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRecommend_reason() {
                return recommend_reason;
            }

            public void setRecommend_reason(String recommend_reason) {
                this.recommend_reason = recommend_reason;
            }

            public int getRecommend_type() {
                return recommend_type;
            }

            public void setRecommend_type(int recommend_type) {
                this.recommend_type = recommend_type;
            }

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }

            public boolean isUser_verified() {
                return user_verified;
            }

            public void setUser_verified(boolean user_verified) {
                this.user_verified = user_verified;
            }

            public String getVerified_content() {
                return verified_content;
            }

            public void setVerified_content(String verified_content) {
                this.verified_content = verified_content;
            }
        }

        public static class MiddleImageBean {
            /**
             * height : 357
             * uri : list/374100012f81f35c8aaf
             * url : http://p1.pstatp.com/list/374100012f81f35c8aaf
             * url_list : [{"url":"http://p1.pstatp.com/list/374100012f81f35c8aaf"},{"url":"http://pb3.pstatp.com/list/374100012f81f35c8aaf"},{"url":"http://pb9.pstatp.com/list/374100012f81f35c8aaf"}]
             * width : 636
             */

            private int height;
            private String uri;
            private String url;
            private int width;
            private List<UrlListBean> url_list;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<UrlListBean> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBean> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBean {
                /**
                 * url : http://p1.pstatp.com/list/374100012f81f35c8aaf
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class UgcRecommendBean {
            /**
             * activity :
             * reason :
             */

            private String activity;
            private String reason;

            public String getActivity() {
                return activity;
            }

            public void setActivity(String activity) {
                this.activity = activity;
            }

            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }
        }

        public static class UserInfoBean {
            /**
             * avatar_url : http://p1.pstatp.com/thumb/150d0011669fdb89463c
             * description : 为动漫爱好者带来不一样的动漫，只要你想看就没有你看不到的动漫
             * follow : false
             * follower_count : 0
             * name : 大军爱动漫
             * user_id : 52715449621
             * user_verified : false
             */

            private String avatar_url;
            private String description;
            private boolean follow;
            private int follower_count;
            private String name;
            private long user_id;
            private boolean user_verified;

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public int getFollower_count() {
                return follower_count;
            }

            public void setFollower_count(int follower_count) {
                this.follower_count = follower_count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }

            public boolean isUser_verified() {
                return user_verified;
            }

            public void setUser_verified(boolean user_verified) {
                this.user_verified = user_verified;
            }
        }

        public static class VideoDetailInfoBean {
            /**
             * detail_video_large_image : {"height":326,"uri":"video1609/374100012f81f35c8aaf","url":"http://p1.pstatp.com/video1609/374100012f81f35c8aaf","url_list":[{"url":"http://p1.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb3.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb9.pstatp.com/video1609/374100012f81f35c8aaf"}],"width":580}
             * direct_play : 1
             * group_flags : 32832
             * show_pgc_subscribe : 1
             * video_id : 1e58d1571c134dcfa232fc744f6296e4
             * video_preloading_flag : 0
             * video_type : 0
             * video_watch_count : 8516
             * video_watching_count : 0
             */

            private DetailVideoLargeImageBean detail_video_large_image;
            private int direct_play;
            private int group_flags;
            private int show_pgc_subscribe;
            private String video_id;
            private int video_preloading_flag;
            private int video_type;
            private int video_watch_count;
            private int video_watching_count;

            public DetailVideoLargeImageBean getDetail_video_large_image() {
                return detail_video_large_image;
            }

            public void setDetail_video_large_image(DetailVideoLargeImageBean detail_video_large_image) {
                this.detail_video_large_image = detail_video_large_image;
            }

            public int getDirect_play() {
                return direct_play;
            }

            public void setDirect_play(int direct_play) {
                this.direct_play = direct_play;
            }

            public int getGroup_flags() {
                return group_flags;
            }

            public void setGroup_flags(int group_flags) {
                this.group_flags = group_flags;
            }

            public int getShow_pgc_subscribe() {
                return show_pgc_subscribe;
            }

            public void setShow_pgc_subscribe(int show_pgc_subscribe) {
                this.show_pgc_subscribe = show_pgc_subscribe;
            }

            public String getVideo_id() {
                return video_id;
            }

            public void setVideo_id(String video_id) {
                this.video_id = video_id;
            }

            public int getVideo_preloading_flag() {
                return video_preloading_flag;
            }

            public void setVideo_preloading_flag(int video_preloading_flag) {
                this.video_preloading_flag = video_preloading_flag;
            }

            public int getVideo_type() {
                return video_type;
            }

            public void setVideo_type(int video_type) {
                this.video_type = video_type;
            }

            public int getVideo_watch_count() {
                return video_watch_count;
            }

            public void setVideo_watch_count(int video_watch_count) {
                this.video_watch_count = video_watch_count;
            }

            public int getVideo_watching_count() {
                return video_watching_count;
            }

            public void setVideo_watching_count(int video_watching_count) {
                this.video_watching_count = video_watching_count;
            }

            public static class DetailVideoLargeImageBean {
                /**
                 * height : 326
                 * uri : video1609/374100012f81f35c8aaf
                 * url : http://p1.pstatp.com/video1609/374100012f81f35c8aaf
                 * url_list : [{"url":"http://p1.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb3.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb9.pstatp.com/video1609/374100012f81f35c8aaf"}]
                 * width : 580
                 */

                private int height;
                private String uri;
                private String url;
                private int width;
                private List<UrlListBeanX> url_list;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public List<UrlListBeanX> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<UrlListBeanX> url_list) {
                    this.url_list = url_list;
                }

                public static class UrlListBeanX {
                    /**
                     * url : http://p1.pstatp.com/video1609/374100012f81f35c8aaf
                     */

                    private String url;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }
        }

        public static class ActionListBean {
            /**
             * action : 1
             * desc :
             * extra : {}
             */

            private int action;
            private String desc;
            private ExtraBean extra;

            public int getAction() {
                return action;
            }

            public void setAction(int action) {
                this.action = action;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public ExtraBean getExtra() {
                return extra;
            }

            public void setExtra(ExtraBean extra) {
                this.extra = extra;
            }

            public static class ExtraBean {
            }
        }

        public static class FilterWordsBean {
            /**
             * id : 8:0
             * is_selected : false
             * name : 看过了
             */

            private String id;
            private boolean is_selected;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public boolean isIs_selected() {
                return is_selected;
            }

            public void setIs_selected(boolean is_selected) {
                this.is_selected = is_selected;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class LargeImageListBean {
            /**
             * height : 326
             * uri : video1609/374100012f81f35c8aaf
             * url : http://p1.pstatp.com/video1609/374100012f81f35c8aaf
             * url_list : [{"url":"http://p1.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb3.pstatp.com/video1609/374100012f81f35c8aaf"},{"url":"http://pb9.pstatp.com/video1609/374100012f81f35c8aaf"}]
             * width : 580
             */

            private int height;
            private String uri;
            private String url;
            private int width;
            private List<UrlListBeanXX> url_list;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<UrlListBeanXX> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBeanXX> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBeanXX {
                /**
                 * url : http://p1.pstatp.com/video1609/374100012f81f35c8aaf
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class ImageListBean {
            /**
             * height : 164
             * uri : list/32220004cd0ed21ee846
             * url : http://p3.pstatp.com/list/32220004cd0ed21ee846
             * url_list : [{"url":"http://p3.pstatp.com/list/32220004cd0ed21ee846"},{"url":"http://pb9.pstatp.com/list/32220004cd0ed21ee846"},{"url":"http://pb1.pstatp.com/list/32220004cd0ed21ee846"}]
             * width : 292
             */

            private int height;
            private String uri;
            private String url;
            private int width;
            private List<UrlListBeanXXX> url_list;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<UrlListBeanXXX> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBeanXXX> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBeanXXX {
                /**
                 * url : http://p3.pstatp.com/list/32220004cd0ed21ee846
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

}
