package com.feth.mailfred.entities;


public abstract class EntityConstants {

    public static abstract class ScheduledMail {

        public static final String NAME = "ScheduledMail";

        public static abstract class Property {

            public static final String USER_ID = "userId";
            public static final String MAIL_ID = "mailId";
            public static final String SCHEDULED_AT = "scheduledAt";
            public static final String SCHEDULED_FOR = "scheduledFor";
            public static final String PROCESSING_OPTIONS = "processingOptions";
            public static final String PROCESSED_AT = "processedAt";
            public static final String HAS_BEEN_PROCESSED = "hasBeenProcessed";
            public static final String PROCESS_STATUS = "processStatus";

            public static abstract class ProcessingOptions {

                public static final String STAR = "starIt";
                public static final String ARCHIVE_AFTER_SCHEDULING = "archiveAfterScheduling";
                public static final String MARK_UNREAD = "markUnread";
                public static final String MOVE_TO_INBOX = "moveToInbox";
                public static final String ONLY_IF_NO_ANSWER = "onlyIfNoAnswer";

                public static final String[] VALID_PROCESS_OPTION_KEYS = {
                        STAR,
                        MARK_UNREAD,
                        MOVE_TO_INBOX,
                        ONLY_IF_NO_ANSWER,
                        ARCHIVE_AFTER_SCHEDULING
                };
            }

            public static abstract class ProcessStatus {
                public static final String ANSWERED = "answered";
                public static final String NOT_FOUND = "notFound";
                public static final String CANCELED = "canceled";
                public static final String OUTBOX_LABEL_REMOVED = "labelRemoved";
                public static final String PROCESSED_CORRECTLY = "ok";
                public static final String ERROR = "error";
            }
        }
    }

}
