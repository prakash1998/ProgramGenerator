package com.integ;

import com.squareup.javapoet.ClassName;

public class LibraryClasses {

    //DBUtil
    public static ClassName getDBUtilModificationSupport(){
        return ClassName.get("com.integ.data","ModificationSupport");
    }
    public static ClassName getDBUtilComplexParamParser(){
        return ClassName.get("com.integ.db.params","ComplexParamParser");
    }
    public static ClassName getDBUtilMapper(){
        return ClassName.get("com.integ.db.mapper","Mapper");
    }
    public static ClassName getDBUtilDataOperationDef$OpType(){
        return ClassName.get("com.integ.data.immutables","DataOperationDef$OpType");
    }
    public static ClassName getDBUtilImmutableExtractors(){
        return ClassName.get("com.integ.db.mapper","ImmutableExtractors");
    }
    public static ClassName getDBUtilDataOperation$InitShim(){
        return ClassName.get("com.integ.data.immutables","DataOperation$InitShim");
    }
    public static ClassName getDBUtilParamInfo(){
        return ClassName.get("com.integ.db.params","ParamInfo");
    }
    public static ClassName getDBUtilCustomExtractor(){
        return ClassName.get("com.integ.db.mapper","CustomExtractor");
    }
    public static ClassName getDBUtilMapResults(){
        return ClassName.get("com.integ.db.extractor","MapResults");
    }
    public static ClassName getDBUtilDataOperation(){
        return ClassName.get("com.integ.data.immutables","DataOperation");
    }
    public static ClassName getDBUtilEffectiveBy(){
        return ClassName.get("com.integ.db.query","EffectiveBy");
    }
    public static ClassName getDBUtilBasicStatementBuilder$1(){
        return ClassName.get("com.integ.db","BasicStatementBuilder$1");
    }
    public static ClassName getDBUtilDataOperation$Builder(){
        return ClassName.get("com.integ.data.immutables","DataOperation$Builder");
    }
    public static ClassName getDBUtilParameterParserUtil(){
        return ClassName.get("com.integ.db.params","ParameterParserUtil");
    }
    public static ClassName getDBUtilMapperInfo$1(){
        return ClassName.get("com.integ.db.mapper","MapperInfo$1");
    }
    public static ClassName getDBUtilDataOperation$1(){
        return ClassName.get("com.integ.data.immutables","DataOperation$1");
    }
    public static ClassName getDBUtilParameterParser(){
        return ClassName.get("com.integ.db.params","ParameterParser");
    }
    public static ClassName getDBUtilDataOperationDef(){
        return ClassName.get("com.integ.data.immutables","DataOperationDef");
    }
    public static ClassName getDBUtilParamType(){
        return ClassName.get("com.integ.db.params","ParamType");
    }
    public static ClassName getDBUtilMapperInfo(){
        return ClassName.get("com.integ.db.mapper","MapperInfo");
    }
    public static ClassName getDBUtilParameterSetterFactory$5(){
        return ClassName.get("com.integ.db.setter","ParameterSetterFactory$5");
    }
    public static ClassName getDBUtilIntegDataSupport(){
        return ClassName.get("com.integ.data","IntegDataSupport");
    }
    public static ClassName getDBUtilIdentConverter(){
        return ClassName.get("com.integ.db.query","IdentConverter");
    }
    public static ClassName getDBUtilSingleOperatorCondition(){
        return ClassName.get("com.integ.db.query","SingleOperatorCondition");
    }
    public static ClassName getDBUtilConnectionCloser(){
        return ClassName.get("com.integ.db.connection","ConnectionCloser");
    }
    public static ClassName getDBUtilClosableDataSource(){
        return ClassName.get("com.integ.db.connection","ClosableDataSource");
    }
    public static ClassName getDBUtilModifiableData(){
        return ClassName.get("com.integ.data","ModifiableData");
    }
    public static ClassName getDBUtilParameterPattern(){
        return ClassName.get("com.integ.db.params","ParameterPattern");
    }
    public static ClassName getDBUtilImmutableExtractors$ExtractMode(){
        return ClassName.get("com.integ.db.mapper","ImmutableExtractors$ExtractMode");
    }
    public static ClassName getDBUtilConnectionFactory(){
        return ClassName.get("com.integ.db","ConnectionFactory");
    }
    public static ClassName getDBUtilModificationInfo$Builder(){
        return ClassName.get("com.integ.immutables","ModificationInfo$Builder");
    }
    public static ClassName getDBUtilDBTools(){
        return ClassName.get("com.integ.db","DBTools");
    }
    public static ClassName getDBUtilParameterSetterFactory$1(){
        return ClassName.get("com.integ.db.setter","ParameterSetterFactory$1");
    }
    public static ClassName getDBUtilModificationInfoDef(){
        return ClassName.get("com.integ.immutables","ModificationInfoDef");
    }
    public static ClassName getDBUtilOptr(){
        return ClassName.get("com.integ.db.query","Optr");
    }
    public static ClassName getDBUtilClosableDataSource$1(){
        return ClassName.get("com.integ.db.connection","ClosableDataSource$1");
    }
    public static ClassName getDBUtilModificationInfo$1(){
        return ClassName.get("com.integ.immutables","ModificationInfo$1");
    }
    public static ClassName getDBUtilConditionClause(){
        return ClassName.get("com.integ.db.query","ConditionClause");
    }
    public static ClassName getDBUtilAbstractParameterSetter(){
        return ClassName.get("com.integ.db.setter","AbstractParameterSetter");
    }
    public static ClassName getDBUtilDSFactory(){
        return ClassName.get("com.integ.db.config","DSFactory");
    }
    public static ClassName getDBUtilInCondition(){
        return ClassName.get("com.integ.db.query","InCondition");
    }
    public static ClassName getDBUtilParameterSetterFactory(){
        return ClassName.get("com.integ.db.setter","ParameterSetterFactory");
    }
    public static ClassName getDBUtilModificationInfo(){
        return ClassName.get("com.integ.immutables","ModificationInfo");
    }
    public static ClassName getDBUtilConditionClause$OperatorCondition(){
        return ClassName.get("com.integ.db.query","ConditionClause$OperatorCondition");
    }
    public static ClassName getDBUtilHikariOraDataSource(){
        return ClassName.get("com.integ.db.connection","HikariOraDataSource");
    }
    public static ClassName getDBUtilDbConfigurationException(){
        return ClassName.get("com.integ.db.config","DbConfigurationException");
    }
    public static ClassName getDBUtilQueryOption(){
        return ClassName.get("com.integ.db.query","QueryOption");
    }
    public static ClassName getDBUtilGenericDataSource(){
        return ClassName.get("com.integ.db.connection","GenericDataSource");
    }
    public static ClassName getDBUtilDbConfigurator(){
        return ClassName.get("com.integ.db.config","DbConfigurator");
    }
    public static ClassName getDBUtilAndOr(){
        return ClassName.get("com.integ.db.query","AndOr");
    }
    public static ClassName getDBUtilDefaultDbConfigurator(){
        return ClassName.get("com.integ.db.config","DefaultDbConfigurator");
    }
    public static ClassName getDBUtilRowLimits(){
        return ClassName.get("com.integ.db.query","RowLimits");
    }
    public static ClassName getDBUtilDBCOperation(){
        return ClassName.get("com.integ.db","DBCOperation");
    }
    public static ClassName getDBUtilSortOrder(){
        return ClassName.get("com.integ.db.query","SortOrder");
    }
    public static ClassName getDBUtilParamValues(){
        return ClassName.get("com.integ.db.query","ParamValues");
    }
    public static ClassName getDBUtilDefaultBlobStreamConsumer(){
        return ClassName.get("com.integ.db.extractor","DefaultBlobStreamConsumer");
    }
    public static ClassName getDBUtilDataUtils(){
        return ClassName.get("com.integ.db","DataUtils");
    }
    public static ClassName getDBUtilNotInCondition(){
        return ClassName.get("com.integ.db.query","NotInCondition");
    }
    public static ClassName getDBUtilParameterSetterFactory$4(){
        return ClassName.get("com.integ.db.setter","ParameterSetterFactory$4");
    }
    public static ClassName getDBUtilColDataExtractorFactory$5(){
        return ClassName.get("com.integ.db.extractor","ColDataExtractorFactory$5");
    }
    public static ClassName getDBUtilSingleValueRSExtractor(){
        return ClassName.get("com.integ.db.extractor","SingleValueRSExtractor");
    }
    public static ClassName getDBUtilBasicStatementBuilder(){
        return ClassName.get("com.integ.db","BasicStatementBuilder");
    }
    public static ClassName getDBUtilBasicCondition(){
        return ClassName.get("com.integ.db.query","BasicCondition");
    }
    public static ClassName getDBUtilDBException(){
        return ClassName.get("com.integ.db","DBException");
    }
    public static ClassName getDBUtilBuiltClause(){
        return ClassName.get("com.integ.db.query","BuiltClause");
    }
    public static ClassName getDBUtilParameterSetter(){
        return ClassName.get("com.integ.db.setter","ParameterSetter");
    }
    public static ClassName getDBUtilDirectDBInfo(){
        return ClassName.get("com.integ.db","DirectDBInfo");
    }
    public static ClassName getDBUtilCondition(){
        return ClassName.get("com.integ.db.query","Condition");
    }
    public static ClassName getDBUtilParameterSetterFactory$3(){
        return ClassName.get("com.integ.db.setter","ParameterSetterFactory$3");
    }
    public static ClassName getDBUtilDbInfo$Builder(){
        return ClassName.get("com.integ.db.immutables","DbInfo$Builder");
    }
    public static ClassName getDBUtilParameterSetterFactory$2(){
        return ClassName.get("com.integ.db.setter","ParameterSetterFactory$2");
    }
    public static ClassName getDBUtilColDataExtractorFactory$7(){
        return ClassName.get("com.integ.db.extractor","ColDataExtractorFactory$7");
    }
    public static ClassName getDBUtilAuditSupportOptions(){
        return ClassName.get("com.integ.db.immutables","AuditSupportOptions");
    }
    public static ClassName getDBUtilDAOperation(){
        return ClassName.get("com.integ.db","DAOperation");
    }
    public static ClassName getDBUtilRowExtractor(){
        return ClassName.get("com.integ.db.extractor","RowExtractor");
    }
    public static ClassName getDBUtilAuditSupportOptions$InitShim(){
        return ClassName.get("com.integ.db.immutables","AuditSupportOptions$InitShim");
    }
    public static ClassName getDBUtilSortItem(){
        return ClassName.get("com.integ.db.query","SortItem");
    }
    public static ClassName getDBUtilColDataExtractorFactory$6(){
        return ClassName.get("com.integ.db.extractor","ColDataExtractorFactory$6");
    }
    public static ClassName getDBUtilAuditSupportOptionsDef(){
        return ClassName.get("com.integ.db.immutables","AuditSupportOptionsDef");
    }
    public static ClassName getDBUtilRefCondition(){
        return ClassName.get("com.integ.db.query","RefCondition");
    }
    public static ClassName getDBUtilImmutableOraDs(){
        return ClassName.get("com.integ.db.immutables","ImmutableOraDs");
    }
    public static ClassName getDBUtilRef(){
        return ClassName.get("com.integ.db.query","Ref");
    }
    public static ClassName getDBUtilDbInfoBuilder$ImmutableDbInfo(){
        return ClassName.get("com.integ.db.immutables","DbInfoBuilder$ImmutableDbInfo");
    }
    public static ClassName getDBUtilDataAccess$1(){
        return ClassName.get("com.integ.db","DataAccess$1");
    }
    public static ClassName getDBUtilColDataExtractorFactory(){
        return ClassName.get("com.integ.db.extractor","ColDataExtractorFactory");
    }
    public static ClassName getDBUtilAuditSupportOptions$1(){
        return ClassName.get("com.integ.db.immutables","AuditSupportOptions$1");
    }
    public static ClassName getDBUtilIntegAuditSupport(){
        return ClassName.get("com.integ.db","IntegAuditSupport");
    }
    public static ClassName getDBUtilSQLBuilder$1(){
        return ClassName.get("com.integ.db.mapper","SQLBuilder$1");
    }
    public static ClassName getDBUtilImmutableOraDs$Builder(){
        return ClassName.get("com.integ.db.immutables","ImmutableOraDs$Builder");
    }
    public static ClassName getDBUtilImmutableExtractors$ColDataExtractor(){
        return ClassName.get("com.integ.db.mapper","ImmutableExtractors$ColDataExtractor");
    }
    public static ClassName getDBUtilOraDs(){
        return ClassName.get("com.integ.db.immutables","OraDs");
    }
    public static ClassName getDBUtilFunctionalParamValues(){
        return ClassName.get("com.integ.db.mapper","FunctionalParamValues");
    }
    public static ClassName getDBUtilDbValues(){
        return ClassName.get("com.integ.db.immutables","DbValues");
    }
    public static ClassName getDBUtilMapperInfo$Builder(){
        return ClassName.get("com.integ.db.mapper","MapperInfo$Builder");
    }
    public static ClassName getDBUtilColDataExtractorFactory$1(){
        return ClassName.get("com.integ.db.extractor","ColDataExtractorFactory$1");
    }
    public static ClassName getDBUtilBlobDataConsumer(){
        return ClassName.get("com.integ.db.extractor","BlobDataConsumer");
    }
    public static ClassName getDBUtilDbInfoBuilder(){
        return ClassName.get("com.integ.db.immutables","DbInfoBuilder");
    }
    public static ClassName getDBUtilMapperInfo$InitShim(){
        return ClassName.get("com.integ.db.mapper","MapperInfo$InitShim");
    }
    public static ClassName getDBUtilDbInfoBuilder$ImmutableDbInfo$InitShim(){
        return ClassName.get("com.integ.db.immutables","DbInfoBuilder$ImmutableDbInfo$InitShim");
    }
    public static ClassName getDBUtilImmutableDataMapper(){
        return ClassName.get("com.integ.db.mapper","ImmutableDataMapper");
    }
    public static ClassName getDBUtilDbInfo(){
        return ClassName.get("com.integ.db.immutables","DbInfo");
    }
    public static ClassName getDBUtilSQLBuilder(){
        return ClassName.get("com.integ.db.mapper","SQLBuilder");
    }
    public static ClassName getDBUtilDefaultBlobExtractor(){
        return ClassName.get("com.integ.db.extractor","DefaultBlobExtractor");
    }
    public static ClassName getDBUtilOutResults(){
        return ClassName.get("com.integ.db.extractor","OutResults");
    }
    public static ClassName getDBUtilDbInfoBuilder$1(){
        return ClassName.get("com.integ.db.immutables","DbInfoBuilder$1");
    }
    public static ClassName getDBUtilSQLBuilder$StatementType(){
        return ClassName.get("com.integ.db.mapper","SQLBuilder$StatementType");
    }
    public static ClassName getDBUtilListRSExtractor(){
        return ClassName.get("com.integ.db.extractor","ListRSExtractor");
    }
    public static ClassName getDBUtilColDataExtractorFactory$4(){
        return ClassName.get("com.integ.db.extractor","ColDataExtractorFactory$4");
    }
    public static ClassName getDBUtilImmutableOraDs$1(){
        return ClassName.get("com.integ.db.immutables","ImmutableOraDs$1");
    }
    public static ClassName getDBUtilDataAccess(){
        return ClassName.get("com.integ.db","DataAccess");
    }
    public static ClassName getDBUtilColDataExtractorFactory$2(){
        return ClassName.get("com.integ.db.extractor","ColDataExtractorFactory$2");
    }
    public static ClassName getDBUtilRSExtractor(){
        return ClassName.get("com.integ.db.extractor","RSExtractor");
    }
    public static ClassName getDBUtilRSExtractorUtil(){
        return ClassName.get("com.integ.db.extractor","RSExtractorUtil");
    }
    public static ClassName getDBUtilAuditSupportOptions$Builder(){
        return ClassName.get("com.integ.db.immutables","AuditSupportOptions$Builder");
    }
    public static ClassName getDBUtilMappableImmutable(){
        return ClassName.get("com.integ.db.mapper","MappableImmutable");
    }
    public static ClassName getDBUtilConnectionRegistry(){
        return ClassName.get("com.integ.db","ConnectionRegistry");
    }
    public static ClassName getDBUtilMapperInfoDef(){
        return ClassName.get("com.integ.db.mapper","MapperInfoDef");
    }
    public static ClassName getDBUtilDirectConnectionFactory(){
        return ClassName.get("com.integ.db","DirectConnectionFactory");
    }
    public static ClassName getDBUtilJodaSupport(){
        return ClassName.get("com.integ.db.mapper","JodaSupport");
    }
    public static ClassName getDBUtilColValueExtractor(){
        return ClassName.get("com.integ.db.extractor","ColValueExtractor");
    }
    public static ClassName getDBUtilColDataExtractorFactory$3(){
        return ClassName.get("com.integ.db.extractor","ColDataExtractorFactory$3");
    }
    public static ClassName getDBUtilMapRowExtractor(){
        return ClassName.get("com.integ.db.extractor","MapRowExtractor");
    }
    public static ClassName getDBUtilWaitForDbStart(){
        return ClassName.get("com.integ.db","WaitForDbStart");
    }

    // common

    public static ClassName getCommonEffectiveUnitData(){
        return ClassName.get("com.integ.data","EffectiveUnitData");
    }
    public static ClassName getCommonBigDecimalSerializerJackson(){
        return ClassName.get("com.integ.core.jackson","BigDecimalSerializer");
    }
    public static ClassName getCommonNotImplementedException(){
        return ClassName.get("com.integ.core.exception","NotImplementedException");
    }
    public static ClassName getCommonUnitData(){
        return ClassName.get("com.integ.data","UnitData");
    }
    public static ClassName getCommonSpaServletFilter(){
        return ClassName.get("com.integ.core.servlet","SpaServletFilter");
    }
    public static ClassName getCommonThrowableUtils(){
        return ClassName.get("com.integ.core.exception","ThrowableUtils");
    }
    public static ClassName getCommonWrapperFunction(){
        return ClassName.get("com.integ.core.common.function","WrapperFunction");
    }
    public static ClassName getCommonWrapperConsumer(){
        return ClassName.get("com.integ.core.common.function","WrapperConsumer");
    }
    public static ClassName getCommonHandledException(){
        return ClassName.get("com.integ.core.exception","HandledException");
    }
    public static ClassName getCommonDelegateFunction(){
        return ClassName.get("com.integ.core.common.function","DelegateFunction");
    }
    public static ClassName getCommonDelegateConsumer(){
        return ClassName.get("com.integ.core.common.function","DelegateConsumer");
    }
    public static ClassName getCommonJsonExceptionMapper(){
        return ClassName.get("com.integ.core.exception","JsonExceptionMapper");
    }
    public static ClassName getCommonWrapperTest(){
        return ClassName.get("com.integ.core.common.function","WrapperTest");
    }
    public static ClassName getCommonBadRequestException(){
        return ClassName.get("com.integ.core.exception","BadRequestException");
    }
    public static ClassName getCommonStreamToByteArray(){
        return ClassName.get("com.integ.core.common.util","StreamToByteArray");
    }
    public static ClassName getCommonAppException(){
        return ClassName.get("com.integ.core.exception","AppException");
    }
    public static ClassName getCommonUtils(){
        return ClassName.get("com.integ.core.api","Utils");
    }
    public static ClassName getCommonCertInfo(){
        return ClassName.get("com.integ.security.immutable","CertInfo");
    }
    public static ClassName getCommonUnSafeFunction(){
        return ClassName.get("com.integ.core.common.util","UnSafeFunction");
    }
    public static ClassName getCommonFallBackExceptionMapper(){
        return ClassName.get("com.integ.core.exception","FallBackExceptionMapper");
    }
    public static ClassName getCommonCertInfo$Builder(){
        return ClassName.get("com.integ.security.immutable","CertInfo$Builder");
    }
    public static ClassName getCommonUnSafeUtils(){
        return ClassName.get("com.integ.core.common.util","UnSafeUtils");
    }
    public static ClassName getCommonAppExceptionMapper(){
        return ClassName.get("com.integ.core.exception","AppExceptionMapper");
    }
    public static ClassName getCommonUnSafeOp(){
        return ClassName.get("com.integ.core.common.util","UnSafeOp");
    }
    public static ClassName getCommonDefStyle(){
        return ClassName.get("com.integ.core.immutables","DefStyle");
    }
    public static ClassName getCommonCertInfoDef(){
        return ClassName.get("com.integ.security.immutable","CertInfoDef");
    }
    public static ClassName getCommonPair(){
        return ClassName.get("com.integ.core.immutables","Pair");
    }
    public static ClassName getCommonPairDef(){
        return ClassName.get("com.integ.core.immutables","PairDef");
    }
    public static ClassName getCommonCertInfo$1(){
        return ClassName.get("com.integ.security.immutable","CertInfo$1");
    }
    public static ClassName getCommonPair$PairBuilder(){
        return ClassName.get("com.integ.core.immutables","Pair$PairBuilder");
    }
    public static ClassName getCommonPair$1(){
        return ClassName.get("com.integ.core.immutables","Pair$1");
    }
    public static ClassName getCommonCertUtil(){
        return ClassName.get("com.integ.security","CertUtil");
    }
    public static ClassName getCommonOkResponse(){
        return ClassName.get("com.integ.core.rest","OkResponse");
    }
    public static ClassName getCommonJodaParameterConverterProvider$LocalDateParamConverter(){
        return ClassName.get("com.integ.core.rest","JodaParameterConverterProvider$LocalDateParamConverter");
    }
    public static ClassName getCommonGrizzlyStartException(){
        return ClassName.get("com.integ.core.rest","GrizzlyStartException");
    }
    public static ClassName getCommonValidationMsg$1(){
        return ClassName.get("com.integ.core.rest.immutables","ValidationMsg$1");
    }
    public static ClassName getCommonValidationMsg$InitShim(){
        return ClassName.get("com.integ.core.rest.immutables","ValidationMsg$InitShim");
    }
    public static ClassName getCommonRestfulResponseDef$Status(){
        return ClassName.get("com.integ.core.rest.immutables","RestfulResponseDef$Status");
    }
    public static ClassName getCommonRestfulResponse$Builder(){
        return ClassName.get("com.integ.core.rest.immutables","RestfulResponse$Builder");
    }
    public static ClassName getCommonRestfulResponse$InitShim(){
        return ClassName.get("com.integ.core.rest.immutables","RestfulResponse$InitShim");
    }
    public static ClassName getCommonValidationMsgDef(){
        return ClassName.get("com.integ.core.rest.immutables","ValidationMsgDef");
    }
    public static ClassName getCommonRestfulResponse$1(){
        return ClassName.get("com.integ.core.rest.immutables","RestfulResponse$1");
    }
    public static ClassName getCommonValidationMsg(){
        return ClassName.get("com.integ.core.rest.immutables","ValidationMsg");
    }
    public static ClassName getCommonValidationMsg$Builder(){
        return ClassName.get("com.integ.core.rest.immutables","ValidationMsg$Builder");
    }
    public static ClassName getCommonRestfulResponseDef(){
        return ClassName.get("com.integ.core.rest.immutables","RestfulResponseDef");
    }
    public static ClassName getCommonRestfulResponse(){
        return ClassName.get("com.integ.core.rest.immutables","RestfulResponse");
    }
    public static ClassName getCommonValidationMsgDef$Severity(){
        return ClassName.get("com.integ.core.rest.immutables","ValidationMsgDef$Severity");
    }
    public static ClassName getCommonJodaParameterConverterProvider$LocalDateTimeParamConverter(){
        return ClassName.get("com.integ.core.rest","JodaParameterConverterProvider$LocalDateTimeParamConverter");
    }
    public static ClassName getCommonResponseUtils(){
        return ClassName.get("com.integ.core.rest","ResponseUtils");
    }
    public static ClassName getCommonBigDecimalSerializerRest(){
        return ClassName.get("com.integ.core.rest","BigDecimalSerializer");
    }
    public static ClassName getCommonJodaParameterConverterProvider(){
        return ClassName.get("com.integ.core.rest","JodaParameterConverterProvider");
    }
    public static ClassName getCommonGrizzlyStarter(){
        return ClassName.get("com.integ.core.rest","GrizzlyStarter");
    }
    public static ClassName getCommonJodaParameterConverterProvider$DateTimeParamConverter(){
        return ClassName.get("com.integ.core.rest","JodaParameterConverterProvider$DateTimeParamConverter");
    }
    public static ClassName getCommonErrorResponse(){
        return ClassName.get("com.integ.core.rest","ErrorResponse");
    }
    public static ClassName getCommonJodaParameterConverterProvider$1(){
        return ClassName.get("com.integ.core.rest","JodaParameterConverterProvider$1");
    }
    public static ClassName getCommonTimeUtils(){
        return ClassName.get("com.integ.core.utils","TimeUtils");
    }

}
