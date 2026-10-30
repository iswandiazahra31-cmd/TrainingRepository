<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>
    <xsl:strip-space elements="*"/>
    <xsl:template match="/">
        <staff>
            <xsl:apply-templates select="employees/employee"/>
        </staff>
    </xsl:template>
    <xsl:template match="employee">
        <person>
            <xsl:attribute name="employeeId">
                <xsl:value-of select="id"/>
            </xsl:attribute>
            <fullName>
                <xsl:value-of select="name"/>
            </fullName>
            <departmentsss>
                <xsl:value-of select="department"/>
            </departmentsss>
            <annualSalary>
                <xsl:value-of select="salary"/>
            </annualSalary>
        </person>
    </xsl:template>
</xsl:stylesheet>
