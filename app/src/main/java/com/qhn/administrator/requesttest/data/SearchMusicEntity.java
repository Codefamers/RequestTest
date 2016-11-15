package com.qhn.administrator.requesttest.data;

import java.util.List;

/**
 * Created by Administrator on 2016/9/28 0028.
 */

public class SearchMusicEntity {

    /**
     * pageCount : 10
     * totalCount : 95
     * data[]
     */

    private int pageCount;
    private int totalCount;
    /**
     * songId : 4521955
     * name : 山丘
     * alias : Hills
     * remarks :
     * firstHit : false
     * librettistId : 61087
     * librettistName : null
     * composerId : 61087
     * composerName : null
     * singerId : 61087
     * singerName : 李宗盛
     * singerSFlag : 1
     * albumId : 580059
     * albumName : 山丘
     * favorites : 152099
     * originalId : 4521955
     * type : 0
     * tags : null
     * releaseYear : 0
     * producer : 0
     * publisher : 0
     * status : 1
     * audit : 0
     * lang : 7
     * auditionList : []
     * mvPickCount : 0
     * mvBulletCount : 0
     * outFlag : 0
     * outList : null
     * commentCount : 0
     * riskRank : 11
     * outLinks : []
     * rightKey : {}
     * operType : 0
     * level : 2
     * isExclusive : 0
     * picUrl : http://img.xiami.net/images/album/img73/573/13730931021394697695_4.jpg
     * listenCount : 0
     * singers : [{"singerId":61087,"singerName":"李宗盛","singerSFlag":1,"shopId":0}]
     */

    private List<DataBean> data;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int songId;
        private String name;
        private String alias;
        private String remarks;
        private boolean firstHit;
        private int librettistId;
        private Object librettistName;
        private int composerId;
        private Object composerName;
        private int singerId;
        private String singerName;
        private int singerSFlag;
        private int albumId;
        private String albumName;
        private int favorites;
        private int originalId;
        private int type;
        private Object tags;
        private int releaseYear;
        private int producer;
        private int publisher;
        private int status;
        private int audit;
        private int lang;
        private int mvPickCount;
        private int mvBulletCount;
        private int outFlag;
        private Object outList;
        private int commentCount;
        private int riskRank;
        /**
         * price : 0
         * vipFree : null
         * paymentUnite : 0
         * orderType : 0
         * songRights : []
         * loginStatus : 0
         * musicPackage : []
         * albumPackage : []
         * promotionPackage : null
         */

        private RightKeyBean rightKey;
        private int operType;
        private String level;
        private int isExclusive;
        private String picUrl;
        private int listenCount;
        /**
         * bitRate : 32
         * duration : 405000
         * size : 1663483
         * suffix : m4a
         * url : http://om32.alicdn.com/573/573/1373093102/1772001102_10919583_l.m4a?auth_key=bc9e27339602dc6503c21c91972e45b9-1475636400-0-null
         * typeDescription : 流畅品质
         */

        private List<AuditionListBean> auditionList;
        /**
         * bitRate : 32
         * duration : 405000
         * size : 1663483
         * suffix : m4a
         * url : http://om32.alicdn.com/573/573/1373093102/1772001102_10919583_l.m4a?auth_key=bc9e27339602dc6503c21c91972e45b9-1475636400-0-null
         * typeDescription : 流畅品质
         */

        private List<UrlListBean> urlList;
        /**
         * bitRate : 860
         * duration : 405800
         * size : 43675068
         * suffix : flac
         * url : http://om7.alicdn.com/573/573/1373093102/1772001102_43009296_h.flac?auth_key=1166e50d6b059e970f906bb2e9c88b2a-1475636400-0-null
         * typeDescription : 无损品质
         */

        private List<LlListBean> llList;
        /**
         * id : 0
         * songId : 0
         * videoId : 203346
         * picUrl : http://3p.pic.ttdtweb.com/3p.ttpod.com/video/mv_pic/mv_pic_2/160_90/797/29049/203346.jpg
         * durationMilliSecond : 401240
         * duration : 401240
         * bitRate : 500
         * path : 5c90ac2475c78a0bc07fb2bff4b9d38e
         * size : 30187125
         * suffix : mp4
         * horizontal : 852
         * vertical : 480
         * url : http://otmv.alicdn.com/new/mv_1_2/5c/8e/5c90ac2475c78a0bc07fb2bff4b9d38e.mp4?k=e2f1fff2df1b7f70&t=1475502353
         * type : 0
         * typeDescription : 标清
         */

        private List<MvListBean> mvList;
        private List<?> outLinks;
        /**
         * singerId : 61087
         * singerName : 李宗盛
         * singerSFlag : 1
         * shopId : 0
         */

        private List<SingersBean> singers;

        public int getSongId() {
            return songId;
        }

        public void setSongId(int songId) {
            this.songId = songId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public boolean isFirstHit() {
            return firstHit;
        }

        public void setFirstHit(boolean firstHit) {
            this.firstHit = firstHit;
        }

        public int getLibrettistId() {
            return librettistId;
        }

        public void setLibrettistId(int librettistId) {
            this.librettistId = librettistId;
        }

        public Object getLibrettistName() {
            return librettistName;
        }

        public void setLibrettistName(Object librettistName) {
            this.librettistName = librettistName;
        }

        public int getComposerId() {
            return composerId;
        }

        public void setComposerId(int composerId) {
            this.composerId = composerId;
        }

        public Object getComposerName() {
            return composerName;
        }

        public void setComposerName(Object composerName) {
            this.composerName = composerName;
        }

        public int getSingerId() {
            return singerId;
        }

        public void setSingerId(int singerId) {
            this.singerId = singerId;
        }

        public String getSingerName() {
            return singerName;
        }

        public void setSingerName(String singerName) {
            this.singerName = singerName;
        }

        public int getSingerSFlag() {
            return singerSFlag;
        }

        public void setSingerSFlag(int singerSFlag) {
            this.singerSFlag = singerSFlag;
        }

        public int getAlbumId() {
            return albumId;
        }

        public void setAlbumId(int albumId) {
            this.albumId = albumId;
        }

        public String getAlbumName() {
            return albumName;
        }

        public void setAlbumName(String albumName) {
            this.albumName = albumName;
        }

        public int getFavorites() {
            return favorites;
        }

        public void setFavorites(int favorites) {
            this.favorites = favorites;
        }

        public int getOriginalId() {
            return originalId;
        }

        public void setOriginalId(int originalId) {
            this.originalId = originalId;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getTags() {
            return tags;
        }

        public void setTags(Object tags) {
            this.tags = tags;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }

        public int getProducer() {
            return producer;
        }

        public void setProducer(int producer) {
            this.producer = producer;
        }

        public int getPublisher() {
            return publisher;
        }

        public void setPublisher(int publisher) {
            this.publisher = publisher;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getAudit() {
            return audit;
        }

        public void setAudit(int audit) {
            this.audit = audit;
        }

        public int getLang() {
            return lang;
        }

        public void setLang(int lang) {
            this.lang = lang;
        }

        public int getMvPickCount() {
            return mvPickCount;
        }

        public void setMvPickCount(int mvPickCount) {
            this.mvPickCount = mvPickCount;
        }

        public int getMvBulletCount() {
            return mvBulletCount;
        }

        public void setMvBulletCount(int mvBulletCount) {
            this.mvBulletCount = mvBulletCount;
        }

        public int getOutFlag() {
            return outFlag;
        }

        public void setOutFlag(int outFlag) {
            this.outFlag = outFlag;
        }

        public Object getOutList() {
            return outList;
        }

        public void setOutList(Object outList) {
            this.outList = outList;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public int getRiskRank() {
            return riskRank;
        }

        public void setRiskRank(int riskRank) {
            this.riskRank = riskRank;
        }

        public RightKeyBean getRightKey() {
            return rightKey;
        }

        public void setRightKey(RightKeyBean rightKey) {
            this.rightKey = rightKey;
        }

        public int getOperType() {
            return operType;
        }

        public void setOperType(int operType) {
            this.operType = operType;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public int getIsExclusive() {
            return isExclusive;
        }

        public void setIsExclusive(int isExclusive) {
            this.isExclusive = isExclusive;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public int getListenCount() {
            return listenCount;
        }

        public void setListenCount(int listenCount) {
            this.listenCount = listenCount;
        }

        public List<AuditionListBean> getAuditionList() {
            return auditionList;
        }

        public void setAuditionList(List<AuditionListBean> auditionList) {
            this.auditionList = auditionList;
        }

        public List<UrlListBean> getUrlList() {
            return urlList;
        }

        public void setUrlList(List<UrlListBean> urlList) {
            this.urlList = urlList;
        }

        public List<LlListBean> getLlList() {
            return llList;
        }

        public void setLlList(List<LlListBean> llList) {
            this.llList = llList;
        }

        public List<MvListBean> getMvList() {
            return mvList;
        }

        public void setMvList(List<MvListBean> mvList) {
            this.mvList = mvList;
        }

        public List<?> getOutLinks() {
            return outLinks;
        }

        public void setOutLinks(List<?> outLinks) {
            this.outLinks = outLinks;
        }

        public List<SingersBean> getSingers() {
            return singers;
        }

        public void setSingers(List<SingersBean> singers) {
            this.singers = singers;
        }

        public static class RightKeyBean {
            private int price;
            private Object vipFree;
            private int paymentUnite;
            private int orderType;
            private int loginStatus;
            private Object promotionPackage;
            /**
             * bitRate : 32
             * downFlag : true
             * listenFlag : true
             * downBuyFlag : false
             * listenBuyFlag : false
             * downloadRightFlag : 0
             * auditionRightFlag : 0
             */

            private List<SongRightsBean> songRights;
            private List<?> musicPackage;
            private List<?> albumPackage;

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public Object getVipFree() {
                return vipFree;
            }

            public void setVipFree(Object vipFree) {
                this.vipFree = vipFree;
            }

            public int getPaymentUnite() {
                return paymentUnite;
            }

            public void setPaymentUnite(int paymentUnite) {
                this.paymentUnite = paymentUnite;
            }

            public int getOrderType() {
                return orderType;
            }

            public void setOrderType(int orderType) {
                this.orderType = orderType;
            }

            public int getLoginStatus() {
                return loginStatus;
            }

            public void setLoginStatus(int loginStatus) {
                this.loginStatus = loginStatus;
            }

            public Object getPromotionPackage() {
                return promotionPackage;
            }

            public void setPromotionPackage(Object promotionPackage) {
                this.promotionPackage = promotionPackage;
            }

            public List<SongRightsBean> getSongRights() {
                return songRights;
            }

            public void setSongRights(List<SongRightsBean> songRights) {
                this.songRights = songRights;
            }

            public List<?> getMusicPackage() {
                return musicPackage;
            }

            public void setMusicPackage(List<?> musicPackage) {
                this.musicPackage = musicPackage;
            }

            public List<?> getAlbumPackage() {
                return albumPackage;
            }

            public void setAlbumPackage(List<?> albumPackage) {
                this.albumPackage = albumPackage;
            }

            public static class SongRightsBean {
                private int bitRate;
                private boolean downFlag;
                private boolean listenFlag;
                private boolean downBuyFlag;
                private boolean listenBuyFlag;
                private int downloadRightFlag;
                private int auditionRightFlag;

                public int getBitRate() {
                    return bitRate;
                }

                public void setBitRate(int bitRate) {
                    this.bitRate = bitRate;
                }

                public boolean isDownFlag() {
                    return downFlag;
                }

                public void setDownFlag(boolean downFlag) {
                    this.downFlag = downFlag;
                }

                public boolean isListenFlag() {
                    return listenFlag;
                }

                public void setListenFlag(boolean listenFlag) {
                    this.listenFlag = listenFlag;
                }

                public boolean isDownBuyFlag() {
                    return downBuyFlag;
                }

                public void setDownBuyFlag(boolean downBuyFlag) {
                    this.downBuyFlag = downBuyFlag;
                }

                public boolean isListenBuyFlag() {
                    return listenBuyFlag;
                }

                public void setListenBuyFlag(boolean listenBuyFlag) {
                    this.listenBuyFlag = listenBuyFlag;
                }

                public int getDownloadRightFlag() {
                    return downloadRightFlag;
                }

                public void setDownloadRightFlag(int downloadRightFlag) {
                    this.downloadRightFlag = downloadRightFlag;
                }

                public int getAuditionRightFlag() {
                    return auditionRightFlag;
                }

                public void setAuditionRightFlag(int auditionRightFlag) {
                    this.auditionRightFlag = auditionRightFlag;
                }
            }
        }

        public static class AuditionListBean {
            private int bitRate;
            private int duration;
            private int size;
            private String suffix;
            private String url;
            private String typeDescription;

            public int getBitRate() {
                return bitRate;
            }

            public void setBitRate(int bitRate) {
                this.bitRate = bitRate;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getSuffix() {
                return suffix;
            }

            public void setSuffix(String suffix) {
                this.suffix = suffix;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTypeDescription() {
                return typeDescription;
            }

            public void setTypeDescription(String typeDescription) {
                this.typeDescription = typeDescription;
            }
        }

        public static class UrlListBean {
            private int bitRate;
            private int duration;
            private int size;
            private String suffix;
            private String url;
            private String typeDescription;

            public int getBitRate() {
                return bitRate;
            }

            public void setBitRate(int bitRate) {
                this.bitRate = bitRate;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getSuffix() {
                return suffix;
            }

            public void setSuffix(String suffix) {
                this.suffix = suffix;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTypeDescription() {
                return typeDescription;
            }

            public void setTypeDescription(String typeDescription) {
                this.typeDescription = typeDescription;
            }
        }

        public static class LlListBean {
            private int bitRate;
            private int duration;
            private int size;
            private String suffix;
            private String url;
            private String typeDescription;

            public int getBitRate() {
                return bitRate;
            }

            public void setBitRate(int bitRate) {
                this.bitRate = bitRate;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getSuffix() {
                return suffix;
            }

            public void setSuffix(String suffix) {
                this.suffix = suffix;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTypeDescription() {
                return typeDescription;
            }

            public void setTypeDescription(String typeDescription) {
                this.typeDescription = typeDescription;
            }
        }

        public static class MvListBean {
            private int id;
            private int songId;
            private int videoId;
            private String picUrl;
            private int durationMilliSecond;
            private int duration;
            private int bitRate;
            private String path;
            private int size;
            private String suffix;
            private int horizontal;
            private int vertical;
            private String url;
            private int type;
            private String typeDescription;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getSongId() {
                return songId;
            }

            public void setSongId(int songId) {
                this.songId = songId;
            }

            public int getVideoId() {
                return videoId;
            }

            public void setVideoId(int videoId) {
                this.videoId = videoId;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public int getDurationMilliSecond() {
                return durationMilliSecond;
            }

            public void setDurationMilliSecond(int durationMilliSecond) {
                this.durationMilliSecond = durationMilliSecond;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getBitRate() {
                return bitRate;
            }

            public void setBitRate(int bitRate) {
                this.bitRate = bitRate;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getSuffix() {
                return suffix;
            }

            public void setSuffix(String suffix) {
                this.suffix = suffix;
            }

            public int getHorizontal() {
                return horizontal;
            }

            public void setHorizontal(int horizontal) {
                this.horizontal = horizontal;
            }

            public int getVertical() {
                return vertical;
            }

            public void setVertical(int vertical) {
                this.vertical = vertical;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getTypeDescription() {
                return typeDescription;
            }

            public void setTypeDescription(String typeDescription) {
                this.typeDescription = typeDescription;
            }
        }

        public static class SingersBean {
            private int singerId;
            private String singerName;
            private int singerSFlag;
            private int shopId;

            public int getSingerId() {
                return singerId;
            }

            public void setSingerId(int singerId) {
                this.singerId = singerId;
            }

            public String getSingerName() {
                return singerName;
            }

            public void setSingerName(String singerName) {
                this.singerName = singerName;
            }

            public int getSingerSFlag() {
                return singerSFlag;
            }

            public void setSingerSFlag(int singerSFlag) {
                this.singerSFlag = singerSFlag;
            }

            public int getShopId() {
                return shopId;
            }

            public void setShopId(int shopId) {
                this.shopId = shopId;
            }
        }
    }
}
