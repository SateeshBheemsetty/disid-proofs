package org.springframework.roo.petclinic.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import org.springframework.format.annotation.NumberFormat;
import javax.persistence.Enumerated;
import org.springframework.roo.petclinic.domain.reference.PetType;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import io.springlets.format.EntityFormat;
import javax.persistence.ManyToOne;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Pet
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(entityFormatExpression = "#{name} (#{type})")
@RooJpaAudit
@RooJaxbEntity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class Pet {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Id
    @SequenceGenerator(name = "petGen", sequenceName = "PET_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "petGen")
    private Long id;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Version
    private Integer version;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private boolean sendReminders;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Size(min = 1)
    private String name;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Min(0L)
    @NumberFormat
    private Float weight;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Enumerated
    private PetType type;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "pet")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    @NotAudited // In this case, we don't want to register the changes applied in this relation.
    private Set<Visit> visits = new HashSet<Visit>();

    /**
     * TODO Auto-generated field documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Owner owner;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdDate;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @CreatedBy
    private String createdBy;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modifiedDate;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @LastModifiedBy
    private String modifiedBy;
}
